package com.silenthill.redbook.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig{
    @Bean
    public Cache<String,Object> caffineCache(){
        return Caffeine.newBuilder()
                .expireAfterWrite(7200, TimeUnit.SECONDS)
                .initialCapacity(100)
                .maximumSize(1000)
                .build();
        //过期时间7200秒，初始空间为100，最大空间为1000
    }
}
