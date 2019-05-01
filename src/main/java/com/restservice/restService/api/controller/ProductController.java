package com.restservice.restService.api.controller;

import com.restservice.restService.api.ao.ProductPararmeterAO;
import com.restservice.restService.api.ao.ProductSignParameterAO;
import com.restservice.restService.entity.ProductParameter;
import com.restservice.restService.entity.ProductSignParameter;
import com.restservice.restService.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName ProductController
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 10:59
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/dp")
@Api(value = "获取参数接口", tags = "获取参数接口")
public class ProductController {

  @Autowired
  private ProductService productService;

  @ApiOperation(value = "获取参数")
  @RequestMapping(value = "/getParameters", method = RequestMethod.POST)
  public ProductParameter getParameters(@RequestParam String url, @RequestParam String method,
      @RequestParam String parameterNames) {
    ProductPararmeterAO productPararmeterAO = new ProductPararmeterAO(url, method, parameterNames);
    return productService.getParameters(productPararmeterAO);
  }

  @ApiOperation(value = "获取签名")
  @RequestMapping(value = "/getSign", method = RequestMethod.POST)
  public ProductSignParameter getSign(@RequestParam String url, @RequestParam String method,
      @RequestParam String params, @RequestParam String headers, @RequestParam String body)
      throws Exception {
    ProductSignParameterAO productSignParameterAO = new ProductSignParameterAO(url, method, params,
        headers, body);
    return productService.getSign(productSignParameterAO);
  }
}
