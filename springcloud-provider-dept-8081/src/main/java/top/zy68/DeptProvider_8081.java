package top.zy68;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName DeptProvider_8081
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 12:57
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient // 启动后注册到服务中
@EnableDiscoveryClient
public class DeptProvider_8081 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8081.class, args);
    }
}
