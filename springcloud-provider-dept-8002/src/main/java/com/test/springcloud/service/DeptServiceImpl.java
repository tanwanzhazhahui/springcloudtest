package com.test.springcloud.service;

import com.test.springcloud.Mapper.DeptMapper;
import com.test.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept queryById(Long id) {
        return deptMapper.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
