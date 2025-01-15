package com.whs.exception.enums;

import com.whs.exception.IErrorCode;

/**
 * @Author whs
 * @Date 2025/1/15 14:36
 * @description:
 */
public enum BizErrorCode implements IErrorCode {

  /**
   * 远程调用返回结果为空
   */
  REMOTE_CALL_RESPONSE_IS_NULL("REMOTE_CALL_RESPONSE_IS_NULL", "远程调用返回结果为空"),

  /**
   * 远程调用返回结果失败
   */
  REMOTE_CALL_RESPONSE_IS_FAILED("REMOTE_CALL_RESPONSE_IS_FAILED", "远程调用返回结果失败");

  private String code;
  private String msg;

  BizErrorCode(String code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  /**
   * 错误码
   *
   * @return
   */
  @Override
  public String getCode() {
    return null;
  }

  /**
   * 错误信息
   *
   * @return
   */
  @Override
  public String getMsg() {
    return null;
  }
}
