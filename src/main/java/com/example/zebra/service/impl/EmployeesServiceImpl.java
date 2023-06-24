package com.example.zebra.service.impl;

import com.example.zebra.entity.Employees;
import com.example.zebra.mapper.EmployeesMapper;
import com.example.zebra.service.IEmployeesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author SHEN
 * @since 2023-06-09
 */
@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements IEmployeesService {

}
