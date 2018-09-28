package com.feri.springcloud_04ribbon.app;

import com.feri.springcloud_04ribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:34
 */
@RestController
public class HiApp {
    @Autowired
    private HiService hiService;

    @GetMapping("hiribbon.do")
    public String hi(){
        return hiService.hi();
    }
}
