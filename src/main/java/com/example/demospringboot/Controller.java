package com.example.demospringboot;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // 配置类
    private MyConfig myConfig;

    @Autowired
    public Controller(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    // 以把配置文件的内容以JSON格式返回
    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String getConfig() {
        return new Gson().toJson(myConfig);
    }

}
