package top.zy68;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName ZuulApplication_9003
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/9 16:48
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication_9003 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9003.class,args);
    }
}