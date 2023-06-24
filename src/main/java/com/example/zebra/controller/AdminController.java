package com.example.zebra.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.zebra.entity.Admin;
import com.example.zebra.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SHEN
 * @since 2023-06-09
 */
@RestController
@CrossOrigin
@RequestMapping
public class AdminController {

    @Autowired
    IAdminService adminService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin admin) {
        Admin result = adminService.getOne(
                new LambdaQueryWrapper<Admin>().eq(Admin::getUsername, admin.getUsername()).eq(Admin::getPassword, admin.getPassword()));
        if (result != null) {
            return ResponseEntity.ok().body("{\"status\": \"success\"}");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"status\": \"failure\"}");
        }
    }
}
