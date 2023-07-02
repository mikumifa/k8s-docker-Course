package com.example.adminservice;


import com.example.adminservice.fegin.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@RestController
@EnableFeignClients(basePackages = "com.example.adminservice.fegin")
public class AdminServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplication.class, args);
    }

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/port")
    public Object port(){
        return userFeign.port();
    }

}
