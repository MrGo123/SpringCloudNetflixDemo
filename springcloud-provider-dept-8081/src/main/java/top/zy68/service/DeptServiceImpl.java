package top.zy68.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zy68.mapper.DeptDao;
import top.zy68.model.Dept;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 12:55
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
