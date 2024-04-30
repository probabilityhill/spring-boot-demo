package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;

@Data
public class User {

	private int id;

	private String userName;

	private int age;
	
	@TableField(exist = false)
	private String noColumn;
	
	@TableLogic
	private Integer deleted;

}