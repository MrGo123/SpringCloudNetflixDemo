package top.zy68.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zy68.model.Dept;
import top.zy68.service.DeptService;

import java.util.List;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 12:56
 * @Version 1.0
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet") // 修改get方法为出现异常后进行熔断，自动启用备选方法hystrixGet
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);
        if(dept == null){
            throw new RuntimeException("不存在该用户");
        }
        return dept;
    }
    //备选方法
    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept()
                .setDeptno(id)
                .setDname("未查询到对应信息")
                .setDb_source("no this database，成功启动熔断");
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}
