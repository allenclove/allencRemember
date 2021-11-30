package cn.alenc.birthdaymanagement.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Api(tags = "发送邮件模块")
@RestController
public class SendEmailController {

    @Autowired
    private JavaMailSender mailSender;

    @ApiOperation("发送通知邮件")
    @GetMapping("/send")
    public String sendEmail(HttpServletResponse resp) {
        resp.setStatus(300);
        resp.setHeader("Content-Type","Application/json");
        System.out.print("发送邮件成功");
        return "发送邮件成功";
    }


    @ApiOperation("发送qq邮件")
    @GetMapping("/sendQQEmail")
    public void sendQQEmail() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //发件人
        mailMessage.setFrom("allenc5319@qq.com");

        //收件人
        mailMessage.setTo("1393623445@qq.com");

        //标题
        mailMessage.setSubject("java发送邮件测试");

        //邮件内容
        mailMessage.setText("你好，这个邮件是用来测试java发送邮件功能");

        mailSender.send(mailMessage);
    }
}
