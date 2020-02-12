package com.yes.moudle.springbootproperties.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author yemingheng
 * @since 2020/2/10 17:03
 */
@Configuration
public class RedisConfig
{
	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		StringRedisTemplate redis = new StringRedisTemplate();

		redis.setConnectionFactory(redisConnectionFactory);

		// 设置redis的String/value的默认序列化方式
//		DefaultSerializer stringRedisSerializer = new DefaultSerializer();
		StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
		redis.setKeySerializer(stringRedisSerializer);
		redis.setValueSerializer(stringRedisSerializer);
		redis.setHashKeySerializer(stringRedisSerializer);
		redis.setHashValueSerializer(stringRedisSerializer);

		redis.afterPropertiesSet();

		return redis;
	}

}
