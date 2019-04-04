package com.imooc.firstappdemo.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Action
 * @Description:
 * @Date Create in 2019/4/4 9:33
 */
//@Component
public class TestTask {

    private static  final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //表达式生成地址 http://cron.qqe2.com
    //定义每过3秒执行任务
    //@Scheduled(fixedRate = 3000)
    //4-40秒执行任务
    //@Scheduled(cron = "4-40 * * * * ?")
    public void reportCurrentTime(){
        System.out.println("现在的时间是："+dateFormat.format(new Date()));
    }
}
