package com.restservice.restService.api.ao;

/**
 * @CLassName ProductPararmeterAO
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 11:23
 * @Version 1.0
 **/
public class ProductPararmeterAO {

  private String url;
  private String method;
  private String parameterNames;

  public ProductPararmeterAO(String url, String method, String parameterNames) {
    this.url = url;
    this.method = method;
    this.parameterNames = parameterNames;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getParameterNames() {
    return parameterNames;
  }

  public void setParameterNames(String parameterNames) {
    this.parameterNames = parameterNames;
  }
}
