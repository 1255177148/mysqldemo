package com.example.mysqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mysqldemo.entity.po.IdTest;
import com.example.mysqldemo.entity.vo.TestVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author hezhan
 * @Date 2020/9/1 14:49
 */
public interface IdTestMapper extends BaseMapper<IdTest> {

    List<TestVO> getData(@Param("codes") List<String> codes);
}
