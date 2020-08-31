package com.example.mysqldemo.service.impl;

import com.example.mysqldemo.entity.po.Test;
import com.example.mysqldemo.mapper.TestMapper;
import com.example.mysqldemo.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hezhan
 * @since 2020-07-29
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public void saveTestDataBatch() {
        List<Test> tests = new ArrayList<>();
        Test test = null;
        for (int i = 0; i < 1000000; i++) {
            test = new Test();
            test.setId(UUID.randomUUID().toString());
            test.setName("he" + String.valueOf(i));
            test.setCode("code" + String.valueOf(i));
            tests.add(test);
        }
        saveBatch(tests, 5000);
    }

    @Override
    public List<Test> getTestData() {
        long start = System.currentTimeMillis();
        List<Test> testList = testMapper.getData("he1");
        long end = System.currentTimeMillis();
        System.out.println("总共耗时" + (end - start) + "毫秒");
        return testList;
    }
}