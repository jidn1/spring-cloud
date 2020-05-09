package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudEurekaApplicationTests {
    public static void main(String[] args) {
        final HashMap<Integer,Integer> map = new HashMap<>(4);

        for(int i =0 ;i<100;i++){
            map.put(i,i);
        }
        System.out.println(map.size());
    }

    @Test
    public void contextLoads() {

    }

}
