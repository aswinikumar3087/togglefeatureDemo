package com.philips.togglefeatureDemo.service;

import com.philips.togglefeatureDemo.repository.RepoIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
        name = "feature.toggles.productsFromWebService",
        havingValue = "IR2"
)
public class FeatureService2 implements ServiceIf {

    @Autowired
    RepoIf repoIf;

    public String getName(){
        return repoIf.getNamefromDB();
    }
}
