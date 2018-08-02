package com.example.Contorller;

import com.example.Repository.UserRepository;
import com.example.Utils.CodeEnum;
import com.example.Utils.Result;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;


@RestController
@CrossOrigin
public class DemoContorller {

    @Autowired
    private UserRepository userRepository;

    /**
     * 查询用户列表
     */
    @GetMapping( value = "/test/{id}")
    public Result test(@PathVariable("id") Integer id){
        return new Result(CodeEnum.SUCCESS,userRepository.getOne(id));
    }

    /**
     * 添加用户
     * @param user
     * @param bindingResult 捕捉错误信息
     */
    @PostMapping( value = "/addUser")
    @Transactional
    public Result addUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){//表单验证
            return new Result(CodeEnum.PARAMETER_ERROR,null);
        }
        User user1= userRepository.save(user);
        if(user1==null){
            return new Result(CodeEnum.ERROR,null);
        }
        return new Result(CodeEnum.SUCCESS,user1);

    }

    /**
     * 修改用户信息user
     * @param
     * @param bindingResult 捕捉错误信息
     */
    @PostMapping( value = "/updateUser")
    public Result updateUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){//表单验证
            return new Result(CodeEnum.PARAMETER_ERROR,null);
        }
        User user1= new User();
        user1.setId(user.getId());
        user1.setUserName(user.getUserName());
        if(userRepository.save(user1)==null){
            return new Result(CodeEnum.ERROR,null);
        }
        return new Result(CodeEnum.SUCCESS,null);

    }
}
