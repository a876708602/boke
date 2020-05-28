package com.boke.dao;

import com.boke.test.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
@Repository
public interface TestMapper {
    /**
     * s
     * @return
     */
    List<Test> findAll();

}
