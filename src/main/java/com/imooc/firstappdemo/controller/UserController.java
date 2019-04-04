package com.imooc.firstappdemo.controller;

import com.github.pagehelper.Page;
import com.imooc.firstappdemo.bean.request.IconSearchForm;
import com.imooc.firstappdemo.common.PageBean;
import com.imooc.firstappdemo.entity.IconEntity;
import com.imooc.firstappdemo.service.IconService;
import com.imooc.firstappdemo.util.IMoocJSONResult;
import com.imooc.firstappdemo.util.Resource;
import com.imooc.firstappdemo.util.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${spring.jackson.date-format}")
    private String dateFromat;


    @Autowired
    private IconService iconService;


    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        log.info("access---------------");
        return "hello world!111111111111";

    }

    @RequestMapping("/request")
    @ResponseBody
    public String request(HttpServletRequest request){

        System.out.println(request.getServerName());
        System.out.println(request.getServerPort());
        System.out.println(request.getContextPath());
        return "request params!";
    }

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("name","action333");
        return "view";
    }

    @RequestMapping("/showth")
    public String showth(Model model){
        model.addAttribute("name","action==th");
        return "th/view";
    }

    @RequestMapping("/data")
    @ResponseBody
    public IconEntity data(){

        return iconService.findById(1);
        //return "data";
    }

    @RequestMapping("/page")
    @ResponseBody
    public PageBean<IconEntity> page(){
        return iconService.findByPage(2,2);
    }

    @RequestMapping("/form")
    @ResponseBody
    public String form(IconSearchForm form){
        //System.out.println(form.toString());
        String res = form.toString();
        return res;
    }


    @RequestMapping("/json")
    @ResponseBody
    public IMoocJSONResult json(){
        UserModel user = new UserModel();
        user.setName("xd");
        user.setAge(19);
        user.setBirthday(new Date());
        user.setPassword("123");
        user.setDesc("ddddd");
        return IMoocJSONResult.ok(user);
    }


    @RequestMapping("/resource")
    @ResponseBody
    public IMoocJSONResult resource(){
        Resource r = new Resource();
        BeanUtils.copyProperties(resource,r);

        return IMoocJSONResult.ok(r);
    }



}
