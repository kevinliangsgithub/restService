package com.restservice.restService.entity;

import java.util.List;
import java.util.Map;

/**
 * @CLassName ProductParameter
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 11:20
 * @Version 1.0
 **/
public class ProductParameter {

  private Map<String, Object> status;

  private List<List<Map<String, Object>>> data;

  public Map<String, Object> getStatus() {
    return status;
  }

  public void setStatus(Map<String, Object> status) {
    this.status = status;
  }

  public List<List<Map<String, Object>>> getData() {
    return data;
  }

  public void setData(
      List<List<Map<String, Object>>> data) {
    this.data = data;
  }
}
