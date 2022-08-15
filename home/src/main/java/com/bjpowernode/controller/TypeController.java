package com.bjpowernode.controller;

import com.bjpowernode.domain.Type;
import com.bjpowernode.service.impl.TypeServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "查找类型")
public class TypeController {

    @Resource
    private TypeServiceImpl typeService;

    @ApiOperation(value = "类型信息",notes = "查询所有消费类型")
    @RequestMapping(value = "/type/select",method = RequestMethod.GET)
    public @ResponseBody
    List<Type> selectAllType(){
        return typeService.selectAllType();
    }

    @ApiOperation(value = "新增类型",notes = "增加消费类型")
    @RequestMapping(value = "/type/insert",method = RequestMethod.POST)
    public @ResponseBody boolean insertType(@RequestBody Type type){
        return typeService.insertType(type);
    }

    @ApiOperation(value = "删除类型",notes = "删除消费类型")
    @RequestMapping(value = "/type/delete",method = RequestMethod.DELETE)
    public @ResponseBody boolean deleteType(@RequestParam(value = "type",required = true) String type){
        return typeService.deleteType(type);
    }
}
