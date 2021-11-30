package cn.alenc.birthdaymanagement.controller;

import cn.alenc.birthdaymanagement.vo.ArticleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户信息管理")
@RestController
public class DemoController{

    @ApiOperation("对世界sayhi")
    @GetMapping("/haha")
    public String demo(){
        return "hello world...";
    }

    @ApiOperation("假装这是删除用户的方法")
    @GetMapping("/deleteUser")
    public String deleteDemo(){
        System.out.println("用户已删除");
     return "用户已删除";
    }

    @ApiOperation("获取文章")
    @PostMapping("/getArticle")
    public String getArticle(@RequestBody @Validated ArticleVO vo){
        return vo.toString();
    }
}
