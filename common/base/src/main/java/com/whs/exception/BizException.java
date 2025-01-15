package com.whs.exception;

/**
 * @Author whs
 * @Date 2025/1/15 14:40
 * @description: 业务异常
 */
public class BizException extends RuntimeException{

  private IErrorCode errorCode;

  public BizException(IErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  public BizException(String message, IErrorCode errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public BizException(String message, Throwable cause, IErrorCode errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  public BizException(Throwable cause, IErrorCode errorCode) {
    super(cause);
    this.errorCode = errorCode;
  }

  public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, IErrorCode errorCode) {
    super(message, cause, enableSuppression, writableStackTrace);
    this.errorCode = errorCode;
  }

  public IErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(IErrorCode errorCode) {
    this.errorCode = errorCode;
  }
}
