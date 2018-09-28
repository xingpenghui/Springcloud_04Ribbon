package com.feri.springcloud_04ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:31
 */
@Service
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    public String hi(){
        return restTemplate.getForObject("http://provider1803/hello.do",String.class);
    }


}
