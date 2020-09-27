package com.example.mysqldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mysqldemo.entity.po.IdTest;

/**
 * @Author hezhan
 * @Date 2020/9/1 14:50
 */
public interface IdTestService extends IService<IdTest> {

    /**
     * 测试where条件in大量的数据
     * @return
     */
    String testInMuch();
}
