package com.example.mysqldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.entity.po.IdTest;
import com.example.mysqldemo.mapper.IdTestMapper;
import com.example.mysqldemo.service.IdTestService;
import org.springframework.stereotype.Service;

/**
 * @Author hezhan
 * @Date 2020/9/1 14:50
 */
@Service
public class IdTestServiceImpl extends ServiceImpl<IdTestMapper, IdTest> implements IdTestService {
}
