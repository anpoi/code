package com.bjpowernode.controller;

import com.bjpowernode.domain.Type;
import com.bjpowernode.domain.User;
import com.bjpowernode.service.impl.TypeServiceImpl;
import com.bjpowernode.utils.UUIDUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "工具：生成UUID")
public class UtilsController {
    @Resource
    private TypeServiceImpl typeService;

    @ApiOperation(value = "UUID",notes = "生成UUID")
    @RequestMapping(value = "/UUID",method = RequestMethod.PUT)
    public @ResponseBody String getUUID(){
        return UUIDUtils.getUUID();
    }


}
