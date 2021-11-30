package cn.alenc.birthdaymanagement.controller;

import cn.alenc.birthdaymanagement.Result;
import cn.alenc.birthdaymanagement.entity.UserEmails;
import cn.alenc.birthdaymanagement.enums.StatusCode;
import cn.alenc.birthdaymanagement.service.EmailAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Api("邮箱账号管理模块")
@RestController
public class EmailAccountController {

    @Autowired
    private EmailAccountService emailAccountService;

    @ApiOperation("添加邮箱账户")
    @PostMapping("/addEmailAccount")
    public Result addEmailAccount(@RequestBody UserEmails userEmails){
        UserEmails userEmailInfo = emailAccountService.addEmailAccount(userEmails);
        return new Result(StatusCode.SUCCESS_CODE_200,"添加邮箱账户成功",userEmailInfo);
    }

    @ApiOperation("测试添加的邮箱账户是否可用")
    @PostMapping("/testEmailAccount")
    public Result testEmailAccount(@RequestBody UserEmails userEmails){
        emailAccountService.testEmailAccount(userEmails);
        return new Result(StatusCode.SUCCESS_CODE_200,"修改邮箱账户成功",null);
    }

    @ApiOperation("删除指定邮箱账户")
    @PostMapping("/deleteEmailAccount")
    public Result deleteEmailAccount(@RequestBody UserEmails userEmails){
        emailAccountService.deleteEmailAccount(userEmails);
        return new Result(StatusCode.SUCCESS_CODE_200,"删除邮箱账户成功",userEmails);
    }

    @ApiOperation("修改邮箱账户")
    @PostMapping("/modifyEmailAccount")
    public Result modifyEmailAccount(@RequestBody UserEmails userEmails){
        UserEmails userEmailInfo = emailAccountService.modifyEmailAccount(userEmails);
        return new Result(StatusCode.SUCCESS_CODE_200,"修改邮箱账户成功",userEmailInfo);
    }

    @ApiOperation("查询指定用户邮箱账户")
    @GetMapping("/queryEmailAccountsByUserID")
    public Result queryEmailAccountsByUserID(@RequestParam(required = true) String id){
        Optional<UserEmails> userEmails = emailAccountService.queryEmailAccountsByUserID(id);
        return new Result(StatusCode.SUCCESS_CODE_200,"查询邮箱账户成功",userEmails);
    }
}
