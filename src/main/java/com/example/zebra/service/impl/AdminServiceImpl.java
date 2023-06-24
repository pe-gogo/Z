package com.example.zebra.service.impl;

import com.example.zebra.entity.Admin;
import com.example.zebra.mapper.AdminMapper;
import com.example.zebra.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
