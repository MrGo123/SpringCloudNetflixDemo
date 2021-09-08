package top.zy68.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author Sustart
 * @Date2021/9/8 12:15
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class Dept implements Serializable {
    // 三个表字段
    // key
    private Long deptno;
    private String dname;
    // 原db
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }
}
