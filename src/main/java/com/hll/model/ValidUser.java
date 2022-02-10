package com.hll.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

public class ValidUser implements Serializable {
    @NotBlank(message = "登录名不能为空")
    private String loginname;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @Range(min = 15, max = 60, message = "年龄必须在15到60岁之间")
    private int age;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "生日必须是过去的日期")
    private Date birthday;

    @Email(message = "必须是合法的邮箱地址")
    private String email;

    @Pattern(regexp = "[1][3,8][3,6,9][0-9]{8}", message = "无效的联系方式")
    private String phone;
}
