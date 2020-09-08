package org.cskj.springbootStudent;

import javax.annotation.Resource;

import org.cskj.springbootStudent.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringbootStudentApplicationTests {
	@Resource
	private RedisTemplate<String, Student> redistemplate;
	@Test
	void contextLoads() {
		Student student = new Student(1, "股", "123", "男", 11, "梵蒂冈", null);
		ValueOperations<String, Student> forValue = redistemplate.opsForValue();
		forValue.set("stu", student);
	
		
	}

}
