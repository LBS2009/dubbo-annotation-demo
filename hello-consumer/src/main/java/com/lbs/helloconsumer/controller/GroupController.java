package com.lbs.helloconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lbs.GroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: GroupController
 *
 * @author libosheng
 * @date 2018-9-5
 */
@RestController
public class GroupController {

    @Reference(group = "*")
    private GroupService groupService;

    @GetMapping("/group")
    public String group() {
        return groupService.group();
    }
}
