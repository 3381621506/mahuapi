package org.cskj.springbootStudent.config;

import org.cskj.springbootStudent.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RedisConfig {
	@Bean
	public RedisTemplate<String, Student> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		//创建redis模板类型
		RedisTemplate<String, Student> redisTemplate = new RedisTemplate<>();
		//通过redis工厂创建redis模板
		redisTemplate.setConnectionFactory(redisConnectionFactory);
		//指定向redis中存储的键是什么类型
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		//指定向redis中存储的值是什么类型
		Jackson2JsonRedisSerializer<Student> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Student>(Student.class);
		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
		return redisTemplate;
	}
	@Bean
	//RedisCacheManage管理器（管理redis返回的）
	public RedisCacheManager redisCacheManager(ObjectMapper objectMapper,RedisConnectionFactory redisConnectionFactory) {
		//设置序列化
		//object使用json数据进行序列化
		Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
		//对序列化中的数据进行格式化
		ObjectMapper om = new ObjectMapper();
		//设置json中所有数据都进行数据绑定
		om.setVisibility(PropertyAccessor.ALL,JsonAutoDetect.Visibility.ANY);
		//设置默认类型
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		//将格式化好的om对象放入到json序列化器
		jackson2JsonRedisSerializer.setObjectMapper(om);
		//创建redis缓存配置类
		RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
		.disableCachingNullValues()//空数据不缓存
		.serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))//指定向redis中存储的键是什么类型
		.serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jackson2JsonRedisSerializer));//指定向redis中存储的值是什么类型
		//创建redis缓存管理器并返回
		RedisCacheManager redisCacheManager = RedisCacheManager.builder(redisConnectionFactory).cacheDefaults(redisCacheConfiguration).build();
	  	return redisCacheManager;
		
		
	}
}
