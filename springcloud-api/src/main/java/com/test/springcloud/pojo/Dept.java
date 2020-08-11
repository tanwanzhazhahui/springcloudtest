package com.test.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dname;

    //这个数据存在哪个数据库字段,一个服务，一个数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
