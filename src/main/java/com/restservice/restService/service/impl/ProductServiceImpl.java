package com.restservice.restService.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.restservice.restService.api.ao.ProductPararmeterAO;
import com.restservice.restService.api.ao.ProductSignParameterAO;
import com.restservice.restService.entity.ProductParameter;
import com.restservice.restService.entity.ProductSignParameter;
import com.restservice.restService.service.ProductService;
import com.restservice.restService.util.SignUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @CLassName ProductServiceImpl
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 11:14
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {

  private final Logger log = LoggerFactory.getLogger(getClass());

  @Override
  public ProductParameter getParameters(ProductPararmeterAO productPararmeterAO) {
    log.info("==getParameters");
    String url = productPararmeterAO.getUrl();
    String parameterNames = productPararmeterAO.getParameterNames();
    String parameterValue = "";
    if ("data".equals(parameterNames)) {
      parameterValue = "{\"shopIds\":[\"1BH22UAGS4PJPM002OV181J0ETBGUJ51\"],\"fromDate\":\"20190422\",\"toDate\":\"20190423\"}";
    } else if ("timestamp".equals(parameterNames)) {
      parameterValue = String.valueOf(System.currentTimeMillis());
    }

    ProductParameter productParameter = new ProductParameter();
    Map<String, Object> status = Maps.newHashMap();
    status.put("isSuccess", true);
    status.put("message", "");
    productParameter.setStatus(status);
    List<List<Map<String, Object>>> data = Lists.newArrayList();
    List<Map<String, Object>> listGroup = Lists.newArrayList();
    Map<String, Object> eachParameters = Maps.newHashMap();
    eachParameters.put("name", parameterNames);
    eachParameters.put("value", parameterValue);
    listGroup.add(eachParameters);
    data.add(listGroup);
    productParameter.setData(data);
    return productParameter;
  }

  @Override
  public ProductSignParameter getSign(ProductSignParameterAO productSignParameterAO)
      throws Exception {
    log.info("==getSign");
    ProductSignParameter productSignParameter = new ProductSignParameter();
    String paramsStr = productSignParameterAO.getParams();
    String[] params = paramsStr.split("&");
    HashMap<String, String> hm = Maps.newHashMap();
    for (String eachParam : params) {
      String[] eachParams = eachParam.split("=");
      hm.put(eachParams[0], eachParams[1]);
    }
    //获取签名
    String signValue = SignUtils.getSign("B62265BBA2095A75B8993536CDA33A31", hm, "MD5");
    String signValueCorrect = "ABF65673E24845CAE6C8C7D03083D683";
    Map<String, Object> status = Maps.newHashMap();
    status.put("isSuccess", true);
    status.put("message", "success");
    productSignParameter.setStatus(status);
    Map<String, String> data = Maps.newHashMap();
    data.put("signValue", signValueCorrect);
    productSignParameter.setData(data);
    return productSignParameter;
  }
}
