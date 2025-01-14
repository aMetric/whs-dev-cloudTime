package com.whs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author whs
 * @Date 2025/1/13 16:30
 * @description:
 */
@RestController
@RequestMapping("/logback")
public class LogbackController {

  private static final Logger logger = LoggerFactory.getLogger(LogbackController.class);

  @GetMapping("/test")
  public void test(){
    logger.info("success");
    System.out.println(" result is success");
  }

}
