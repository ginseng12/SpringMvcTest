package com.hll.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    public String userName;
    private String password;
    private String descirbe;
    private String loginName;
}
