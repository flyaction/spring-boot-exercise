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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Slf4j
@Controller
@RequestMapping("mysql")
public class MysqlController {

    private Logger logger = LoggerFactory.getLogger(MysqlController.class);

    @Value("${spring.jackson.date-format}")
    private String dateFromat;


    @Autowired
    private Sid sid;

    @Autowired
    private IconService iconService;




    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String uid = sid.nextShort();
        System.out.println(uid);
        return "hello world!111111111111";
    }

    @RequestMapping("/page")
    @ResponseBody
    public PageBean<DataAppDpi> page(){

        DataAppDpi dpi = new DataAppDpi();
        dpi.setAppName("支付");

        return iconService.findMyPage(dpi,5,2);
    }



    @RequestMapping("/shiwu")
    @ResponseBody
    public void shiwu(){

        DataAppDpi dpi = new DataAppDpi();
        dpi.setTdid("TD00018");
        dpi.setCategory("TD00018");
        dpi.setAppName("TD00018");
        dpi.setPkgName("TD00018");
        dpi.setUrl("TD00018");
        dpi.setHost("TD00018");
        dpi.setFrom("TD00018");
        dpi.setType("TD00018");
        dpi.setWoker("TD00018");
        dpi.setCreateTime(new Date());

        iconService.saveTransactional(dpi);
    }



}
