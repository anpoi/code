package com.bjpowernode;

import com.bjpowernode.utils.UUIDUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HomeApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(UUIDUtils.getUUID());
    }

}
