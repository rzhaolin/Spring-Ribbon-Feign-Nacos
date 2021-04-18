package com.rzl.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.rzl.feignclient.FeignClientController.PATH_CMS_GET_CONTENT;

@FeignClient(name = "cms", fallback = CmsHystrix.class)
public interface CmsApi {
    @GetMapping(path = PATH_CMS_GET_CONTENT)
    String getContent();
}
