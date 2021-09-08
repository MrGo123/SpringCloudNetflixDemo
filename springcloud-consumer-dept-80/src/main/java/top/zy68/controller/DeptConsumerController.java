package top.zy68.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.zy68.model.Dept;

import java.util.List;

/**
 * @ClassName DeptConsumerController
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 13:06
 * @Version 1.0
 **/

@RestController
public class DeptConsumerController {

    /**
     * 服务的消费者
     * <p>
     * 该消费者不自己实现service，而通过restTemplate来调用其他服务的接口，调用方式基于http。
     * <p>
     * RestTemplate
     * 是Spring提供的用于访问Rest服务的客户端模板工具集
     * （url，requsetMap，ResponseBean.class） 这三个参数分别代表
     * REST请求地址，请求参数，Http响应转换 被 转换成的对象类型
     */



    @Autowired
    private RestTemplate restTemplate;
    // 普通的通过restTemplate使用其他服务的方式：提供链接
    // private static final String REST_URL_PREFIX = "http://localhost:8081";

    // 特殊使用的是生产者的服务名访问。
    // 要使用这种方式，服务提供者启动类要使用@EnableDiscoveryClient注解，且RestTemplate的Bean也要使用@LoadBalanced实现负载均衡
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
