package com.example.zebra.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Gen {
    public static void main(String[] args) {
        {
            FastAutoGenerator.create("jdbc:mysql://localhost:3306/ee150?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=true", "root", "12345678")
                    .globalConfig(builder -> {
                        builder.author("SHEN") // 设置作者
                                .fileOverride() // 覆盖已生成文件
                                .outputDir(System.getProperty("user.dir")+"/src/main/java"); // 指定输出目录
                    })
                    .packageConfig(builder -> {
                        builder.parent("com.example.zebra") // 设置父包名
                                .moduleName("") // 设置父包模块名
                                .pathInfo(Collections.singletonMap(OutputFile.other, System.getProperty("user.dir")+"/src/main/resources")); // 设置mapperXml生成路径
                    })
                    .strategyConfig(builder -> {
                        builder.addInclude("admin") // 设置需要生成的表名
                                .addTablePrefix("charging_", "c_"); // 设置过滤表前缀
                    })
                    .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                    .execute();
        }

    }
}
