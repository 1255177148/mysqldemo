package com.example.mysqldemo.controller;


import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.entity.po.Test;
import com.example.mysqldemo.service.TestService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hezhan
 * @since 2020-07-29
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "批量导入大量测试用数据", notes = "批量导入大量测试用数据")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = String.class),
            @ApiResponse(code = 500, message = "失败", response = String.class)})
    @PostMapping("/save")
    public void saveBatch(){
        testService.saveTestDataBatch();
    }

    @ApiOperation(value = "测试大量获取数据", notes = "测试大量获取数据")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功", response = String.class),
            @ApiResponse(code = 500, message = "失败", response = String.class)})
    @GetMapping("/get")
    public String get(){
        List<Test> testList = testService.getTestData();
        return JSON.toJSONString(testList);
    }
}
