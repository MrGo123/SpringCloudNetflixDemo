package top.zy68.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.zy68.model.Dept;

import java.util.List;


import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
