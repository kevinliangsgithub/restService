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
    private String parameterNames;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParameterNames() {
        return parameterNames;
    }

    public void setParameterNames(String parameterNames) {
        this.parameterNames = parameterNames;
    }

    public ProductPararmeterAO() {
    }

    public ProductPararmeterAO(String url, String parameterNames) {
        this.url = url;
        this.parameterNames = parameterNames;
    }
}
