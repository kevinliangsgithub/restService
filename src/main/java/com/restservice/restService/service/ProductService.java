package com.restservice.restService.service;

import com.restservice.restService.api.ao.ProductPararmeterAO;
import com.restservice.restService.api.ao.ProductSignParameterAO;
import com.restservice.restService.entity.ProductParameter;
import com.restservice.restService.entity.ProductSignParameter;

public interface ProductService {

  ProductParameter getParameters(ProductPararmeterAO productPararmeterAO);

  ProductSignParameter getSign(ProductSignParameterAO productSignParameterAO) throws Exception;
}
