package com.example.zebra.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author SHEN
 * @since 2023-06-09
 */
@Data
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Integer employeeId;

    private String basicSalary;

    private BigDecimal bonus;

    private BigDecimal deductions;

    private BigDecimal netSalary;


}
