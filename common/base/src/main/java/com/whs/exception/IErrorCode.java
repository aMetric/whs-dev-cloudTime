package com.whs.exception;

/**
 * @Author whs
 * @Date 2025/1/15 14:32
 * @description: 错误码
 */
public interface IErrorCode {
  /**
   * 错误码
   * @return
   */
  String getCode();

  /**
   *错误信息
   * @return
   */
  String getMsg();
}
