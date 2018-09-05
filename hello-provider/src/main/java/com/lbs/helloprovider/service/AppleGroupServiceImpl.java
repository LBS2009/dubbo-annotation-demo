package com.lbs.helloprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lbs.GroupService;

/**
 * description:
 *
 * @author libosheng
 * @date 2018-9-5
 */
@Service(group = "apple")
public class AppleGroupServiceImpl implements GroupService {

    @Override
    public String group() {
        return "AppleGroupService";
    }
}
