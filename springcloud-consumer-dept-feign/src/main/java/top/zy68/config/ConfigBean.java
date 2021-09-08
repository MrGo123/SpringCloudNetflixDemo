package top.zy68.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConfigBean
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 13:04
 * @Version 1.0
 **/
@Configuration
public class ConfigBean {

    //核心：服务调用者。调用服务提供者提供的API为自己用，相当于使用别的服务的service而自己不需要再定义。直接看Controller
    @Bean
    @LoadBalanced // 启用负载均衡，默认轮询
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
