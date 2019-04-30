package com.restservice.restService.service;

import com.restservice.restService.api.ao.ProductPararmeterAO;
import com.restservice.restService.entity.ProductParameter;

public interface ProductService {

    ProductParameter getParameters(ProductPararmeterAO productPararmeterAO);
}
