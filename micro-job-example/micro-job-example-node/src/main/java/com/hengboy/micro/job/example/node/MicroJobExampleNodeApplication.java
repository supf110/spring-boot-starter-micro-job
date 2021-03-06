package com.hengboy.micro.job.example.node;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2019-01-22
 * Time：10:29
 * 个人博客：http://blog.yuqiyu.com
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
public class MicroJobExampleNodeApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MicroJobExampleNodeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroJobExampleNodeApplication.class, args);
        logger.info("「「「「「micro job node 启动完成」」」」」");
    }
}
