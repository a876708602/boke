package com.boke;

import com.boke.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test")
    public String get(){
        return testMapper.findAll().toString();
    }
}
