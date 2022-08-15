
package com.bjpowernode.swagger;

import com.bjpowernode.anno.MyAnnotation4Swagger;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 创建Docket类型的对象。并使用spring容器管理
     * Docket是Swagger中的全局配置对象
     */
    @Bean
    public Docket docket(){

        /**
         * 需要通知springfox创建这个全局对象，是哪个版本的对象
         */

        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        //API帮助文档的描述信息  information
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(//配置swagger文档主题内容
                        new Contact(
                                "admin--pjyxs",//是文档的发布者名称
                                "http://www.taobao.com",//是文档发布者的网站地址。通常是企业网站
                                "admin@baidu.com")//文档发布者的电子邮箱
                )
                .title("家庭消费系统记录")
                .description("该系统用于查询家庭成员信息，以及查询消费清单信息")
                .version("1.1.1")
                .build();
        //给docket上下文配置api描述信息
        docket.apiInfo(apiInfo);

        docket
                .select()//获取Docket中的选择器。返回ApiSelectorBuilder。构建选择器的。如：扫描什么包的组件
                .apis(
                        Predicates.and(
                                Predicates.not(//取反 false-->true  true-->false
                                        RequestHandlerSelectors.withMethodAnnotation(//当方法上有注解的时候返回true
                                                MyAnnotation4Swagger.class)//方法上有这个返回true，然后往上取反
                                ) ,
                                RequestHandlerSelectors.basePackage("com.bjpowernode.controller"))
                )
                //.apis(RequestHandlerSelectors.basePackage("com.bjpowernode.controller"))//设定扫描哪个包（包含子包）中的注解
                .paths(//可以设置满足什么样规则的url被生成接口文档。可以使用正则表达式进行匹配。
                        PathSelectors.regex("/.*")            //使用正则表达式，约束生成API文档的路径地址
                )
                .build();//重新构建Docket对象。返回ApiSelectorBuilder是需要重新构建的

        return docket;
    }
}

