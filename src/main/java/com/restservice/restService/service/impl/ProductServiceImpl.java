package com.restservice.restService.service.impl;

import com.google.common.collect.Maps;
import com.restservice.restService.api.ao.ProductPararmeterAO;
import com.restservice.restService.entity.ProductParameter;
import com.restservice.restService.service.ProductService;
import java.util.Map;
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

    @Override
    public ProductParameter getParameters(ProductPararmeterAO productPararmeterAO) {
        ProductParameter productParameter = new ProductParameter();
        Map<String, Object> objectObjectHashMap = Maps.newHashMap();
        objectObjectHashMap.put("name", "value1");
        objectObjectHashMap.put("name1", true);
        productParameter.setStatus(objectObjectHashMap);
        return productParameter;
    }
}
