package com.bjpowernode.controller;

import com.bjpowernode.domain.Shopping;
import com.bjpowernode.service.ShoppingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@Controller
@Api(tags = "消费信息")
public class ShoppController {

    @Resource
    private ShoppingService shoppingService;

    @ApiOperation(value = "新增消费记录",notes = "增加消费记录")
    @RequestMapping(value = "/Shopping/insert",method = RequestMethod.POST)
    public @ResponseBody
    boolean insertShopping(@RequestBody Shopping shopping){
        return shoppingService.insertShopping(shopping);
    }

    @ApiOperation(value = "消费信息",notes = "查询所有的消费记录")
    @RequestMapping(value = "/Shopping/select",method = RequestMethod.GET)
    public @ResponseBody
    List<Shopping> selectAllShopping(){
        return shoppingService.selectAllShopping();
    }

    @ApiOperation(value = "更新消费记录",notes = "根据id更改指定的消费记录")
    @RequestMapping(value = "/Shopping/update",method = RequestMethod.PUT)
    public @ResponseBody boolean updateShopping(@RequestBody Shopping shopping){

        return shoppingService.updateShopping(shopping);
    }

    @ApiOperation(value = "删除消费记录",notes = "根据id删除指定的消费记录")
    @RequestMapping(value = "/Shopping/delete",method = RequestMethod.DELETE)
    public @ResponseBody boolean deleteShopping(@RequestParam(value = "id",required = true) String id){

        return shoppingService.deleteShopping(id);
    }
}
