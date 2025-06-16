package com.study; // 替换为你的包名

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com"})
public class QwenChatApplication {

    /**
     * 应用程序入口点
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 启动Spring Boot应用
        SpringApplication.run(QwenChatApplication.class, args);
        
        // 打印启动成功信息
        System.out.println("=================================");

    }
}