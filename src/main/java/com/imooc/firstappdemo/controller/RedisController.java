package com.imooc.firstappdemo.controller;

import com.imooc.firstappdemo.common.PageBean;
import com.imooc.firstappdemo.entity.DataAppDpi;
import com.imooc.firstappdemo.service.IconService;
import lombok.extern.slf4j.Slf4j;
import org.n3r.idworker.Sid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Slf4j
@Controller
@RequestMapping("redis")
public class RedisController {

    private Logger logger = LoggerFactory.getLogger(RedisController.class);


    @Autowired
    private StringRedisTemplate stringRedis;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        stringRedis.opsForValue().set("spring-boot","studying");
        return stringRedis.opsForValue().get("spring-boot");
    }







}
