package top.zy68.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zy68.model.Dept;
import top.zy68.service.DeptClientService;

import java.util.List;

/**
 * @ClassName DeptConsumerController
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/9 0:18
 * @Version 1.0
 **/
@RestController
public class DeptConsumerController {
    @Qualifier("top.zy68.service.DeptClientService")
    @Autowired
    DeptClientService service;
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.addDept(dept);
    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.queryById(id);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.service.queryAll();
    }
}
