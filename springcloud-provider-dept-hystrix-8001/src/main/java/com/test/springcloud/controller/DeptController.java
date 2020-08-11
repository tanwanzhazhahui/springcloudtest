package com.test.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.springcloud.pojo.Dept;
import com.test.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "HystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);

        if(dept==null){
            throw new RuntimeException("这个id=>"+id+"不存在该用户");
        }
        return dept;
    }

    //备选方法
    public Dept HystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+"不存在该用户，信息无法找到@Hystrix")
                .setDb_source("没有这个数据库");
    }
}
