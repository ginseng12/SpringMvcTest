package com.hll.fromat;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    private String datePattern;

    private SimpleDateFormat dateFormat;

    public DateFormatter(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
    }

    @Override
    public Date parse(String source, Locale locale) throws ParseException {
        try {
            return dateFormat.parse(source);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}
