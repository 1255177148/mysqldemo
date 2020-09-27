package com.example.mysqldemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.entity.po.IdTest;
import com.example.mysqldemo.entity.po.Test;
import com.example.mysqldemo.entity.vo.TestVO;
import com.example.mysqldemo.mapper.IdTestMapper;
import com.example.mysqldemo.service.IdTestService;
import com.example.mysqldemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author hezhan
 * @Date 2020/9/1 14:50
 */
@Service
public class IdTestServiceImpl extends ServiceImpl<IdTestMapper, IdTest> implements IdTestService {

    @Autowired
    private TestService testService;

    @Autowired
    private IdTestMapper idTestMapper;

    @Override
    public String testInMuch() {
        List<String> list = insertData();
        List<TestVO> testVOS = idTestMapper.getData(list);
        return JSON.toJSONString(testVOS);
    }

    /**
     * 事先插入数据，以方便测试
     */
    private List<String> insertData(){
        List<IdTest> idTests = new ArrayList<>();
        for (int i = 0;i<10;i++){
            IdTest idTest = new IdTest();
            idTest.setName(String.valueOf(i));
            idTests.add(idTest);
        }
        saveBatch(idTests);

        List<Test> tests = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0;i<150000;i++){
            if (i < 50000){
                list.add(String.valueOf(i));
            }
            Test test = new Test();
            test.setName(String.valueOf(random.nextInt(10)));
            test.setCode(String.valueOf(i));
            tests.add(test);
        }
        testService.saveBatch(tests, 5000);
        return list;
    }
}
