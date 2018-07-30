package com.spring.demon.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service/user")
public class UserInfo {
	
	@GetMapping("/test")
	public String test(){
		return "successful";
	}
	
	public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");//设置日期格式
        Date beginTime = df.parse("09:00");
        Date endTime = df.parse("23:30");
        Calendar date = Calendar.getInstance();
        date.setTime(beginTime);
        Calendar date2 = Calendar.getInstance();
        date2.setTime(endTime);
        Date now = df.parse(df.format(new Date()));
        System.out.println(now.after(beginTime));
        System.out.println(now.after(endTime));
        
	}

}
