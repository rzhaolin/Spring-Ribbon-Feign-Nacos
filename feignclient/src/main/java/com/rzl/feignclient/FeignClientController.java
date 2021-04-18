package com.rzl.feignclient;

import com.rzl.feignclient.service.CmsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {
    public static final String PATH_CMS_GET_CONTENT = "cms/getContent";

    @Autowired
    private CmsApi api;

    @GetMapping(path = PATH_CMS_GET_CONTENT)
    public Object getConetn() {
        return api.getContent();
    }
}
