package com.hll.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Data
@ToString
public class FormatModel {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#,###")
    private int total;

    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double discount;

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;
}
