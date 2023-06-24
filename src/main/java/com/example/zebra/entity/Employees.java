package com.example.zebra.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author SHEN
 * @since 2023-06-09
 */
@Data
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Integer employeeId;

    private String ename;

    private String department;

    private String position;

    private String contact;

    private String address;

    @TableField(exist = false)
    private String salary;

}
