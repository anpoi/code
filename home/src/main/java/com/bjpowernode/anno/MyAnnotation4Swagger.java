package com.bjpowernode.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * target -描述当前的注解可以定义在什么资源上。
 * 属性value
 * -定义具体的资源。包括：
 *  -ElementType.METHOD 可以定义在方法上
 *  -ElementType.TYPE   可以定义在类型上
 *  -ElementType.FIELD  可以定义在属性上
 *  -ElementType.PARAMETER  可以定义在方法参数上
 * Retention -描述当前的注解在什么时候有效
 * 属性value
 *  -定义具体的生效标记
 *  -RetentionPolicy.RUNTIME    -运行时有效
 *  -RetentionPolicy.CLASS      -字节码有效
 *  -RetentionPolicy.SOURCE     -源码中有效
 */
@Target(value={ElementType.METHOD,ElementType.TYPE}) //注解用于方法上 类上
@Retention(RetentionPolicy.RUNTIME)//运行
//表示当前类是一个注解
public @interface MyAnnotation4Swagger {

    //自定义注解中的属性。 相当于@MyAnnotation4Swagger(value="")
    String value() default "";

}
