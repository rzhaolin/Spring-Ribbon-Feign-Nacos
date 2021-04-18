package com.rzl.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmsController {
    public static final String PATH_CMS_GET_CONTENT = "cms/getContent";
    @Autowired
    private CmsService service;

    @GetMapping(path = PATH_CMS_GET_CONTENT)
    @LoadBalanced
    public String getConent() {
        return service.getContent();
    }
}
