package top.zy68;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServer_7001
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 14:45
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer // 开启Eureka
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}