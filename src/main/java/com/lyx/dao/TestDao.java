package com.lyx.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author liao
 * @date 2022/7/6 22:41
 */
@Repository
public interface TestDao {

    public String testDynamicDataSource();

    public Integer testTransational(String v);


    public Integer testUpdate(@Param("v") String value, @Param("t")String target);

}
