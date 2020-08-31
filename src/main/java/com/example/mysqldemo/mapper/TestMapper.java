package com.example.mysqldemo.mapper;

import com.example.mysqldemo.entity.po.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hezhan
 * @since 2020-07-29
 */
public interface TestMapper extends BaseMapper<Test> {

    /**
     * 测试获取大量数据
     * @return
     */
    List<Test> getData(@Param("name") String name);
}
