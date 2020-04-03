package com.philips.togglefeatureDemo.controller;

import com.philips.togglefeatureDemo.service.ServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ToggleFeatureControler {

    @Autowired
    private ServiceIf featureService;


    @Value("${feature.toggles.productsFromWebService}")
    public String featureValue;

    @Value("${app.name}")
    public String appName;

    @GetMapping("/getFeatureKey")
    public String getKey(){
        //System.out.println("appName ::"+appName);
        System.out.println("FeatureKey ::"+featureValue);
        return "feturekey is ::"+featureValue;
    }

    @GetMapping("/getUser")
    public String getUser(){
       return featureService.getName();
    }


}


