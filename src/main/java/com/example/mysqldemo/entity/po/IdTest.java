package com.example.mysqldemo.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author hezhan
 * @Date 2020/9/1 14:47
 */
@Data
@TableName("id_test")
public class IdTest {

    @TableId
    private Long id;

    private String name;
}
