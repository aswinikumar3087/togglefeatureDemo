package com.philips.togglefeatureDemo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty(
        name = "feature.toggles.productsFromWebService",
        havingValue = "IR2"
)
public class ServiceRepo2 implements RepoIf {

    public String getNamefromDB(){
        return "repo2";
    }
}
