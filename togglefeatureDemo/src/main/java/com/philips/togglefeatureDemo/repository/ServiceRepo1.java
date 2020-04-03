package com.philips.togglefeatureDemo.repository;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;


@Repository
@ConditionalOnProperty(
        name = "feature.toggles.productsFromWebService",
        havingValue = "IR1")
public class ServiceRepo1 implements RepoIf {

    public String getNamefromDB(){
        return "repo1";
    }
}
