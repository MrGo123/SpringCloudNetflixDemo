package top.zy68.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import top.zy68.model.Dept;

import java.util.List;

/**
 * @ClassName DeptClientService
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/9 0:15
 * @Version 1.0
 **/
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT") // 用来给Feign的服务使用
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);
    @GetMapping("/dept/list")
    public List<Dept> queryAll();
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);
}
