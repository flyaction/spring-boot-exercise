package com.imooc.firstappdemo.controller;

import com.imooc.firstappdemo.util.IMoocJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error(){
      int a = 1/0;
      return "error";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror() {

        return "th/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public IMoocJSONResult getAjaxerror() {
        int a = 1 / 0;
        return IMoocJSONResult.ok();
    }


}
