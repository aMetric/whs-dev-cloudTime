package com.whs.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Author whs
 * @Date 2025/1/15 14:53
 * @description:
 */
@Setter
@Getter
public class MultiResponse<T> extends BaseResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<T> dataList;

  public static <T> MultiResponse<T> of(List<T> dataList) {
    MultiResponse<T> multiResponse = new MultiResponse<>();
    multiResponse.setSuccess(true);
    multiResponse.setDataList(dataList);
    return multiResponse;
  }
}
