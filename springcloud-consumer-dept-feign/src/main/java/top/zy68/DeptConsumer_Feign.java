package top.zy68;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName DeptConsumer_Feign
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 13:12
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "top.zy68")
public class DeptConsumer_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Feign.class, args);
    }
}