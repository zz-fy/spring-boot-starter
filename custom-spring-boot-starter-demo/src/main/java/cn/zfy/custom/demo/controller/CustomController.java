package cn.zfy.custom.demo.controller;

import cn.zfy.custom.spring.boot.autoconfigure.CustomTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/custom")
public class CustomController {


    @Resource
    private CustomTemplate customTemplate;

    @GetMapping("/some/{param}")
    public String some(@PathVariable(value = "param") String param) {
        return customTemplate.wrap(param);
    }

}
