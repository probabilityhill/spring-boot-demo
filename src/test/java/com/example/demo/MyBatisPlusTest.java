package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@SpringBootTest
class MyBatisPlusTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	void test() {
		List<User> userList = userMapper.selectList(null);
		// ==>  Preparing: SELECT id,user_name,age,deleted FROM user WHERE deleted=0
		// ==> Parameters: 
		// <==      Total: 10
		

//		userList.forEach(System.out::println);
		
		userMapper.deleteById(2);
		// ==>  Preparing: UPDATE user SET deleted=1 WHERE id=? AND deleted=0
		// ==> Parameters: 2(Integer)
		// <==    Updates: 1
		
	}
}
