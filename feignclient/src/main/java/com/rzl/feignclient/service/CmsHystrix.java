package com.rzl.feignclient.service;

import org.springframework.stereotype.Component;

@Component
public class CmsHystrix implements CmsApi {
    @Override
    public String getContent() {
        return "CMS系统异常";
    }
}
