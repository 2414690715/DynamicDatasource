package com.lyx.services;

import com.lyx.annotations.DbSource;
import com.lyx.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liao
 * @date 2022/7/6 23:31
 */
@RestController
public class TestService {

    @Autowired
    private TestDao testDao;


    @DbSource
    @GetMapping("/testDynamic")
    public String testDynamicDatasource(){
        return testDao.testDynamicDataSource();
    }


    @DbSource("slave")
    @GetMapping("/testSlaveDynamic")
    public String testDynamicSlaveDatasource(){
        return testDao.testDynamicDataSource();
    }

}
