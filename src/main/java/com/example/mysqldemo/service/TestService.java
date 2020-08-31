package com.example.mysqldemo.service;

import com.example.mysqldemo.entity.po.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hezhan
 * @since 2020-07-29
 */
public interface TestService extends IService<Test> {

    /**
     * 批量导入测试用数据
     */
    void saveTestDataBatch();

    /**
     * 测试获取大量数据
     * @return
     */
    List<Test> getTestData();
}
