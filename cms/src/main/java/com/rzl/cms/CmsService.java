package com.rzl.cms;

import org.springframework.stereotype.Service;

@Service
public class CmsService {
    public String getContent() {
        return "This message is from cms.";
    }
}
