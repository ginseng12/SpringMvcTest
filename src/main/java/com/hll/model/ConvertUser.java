package com.hll.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class ConvertUser implements Serializable {
    private String loginname;
    private Date birthday;
}
