package com.geekq.springbootlearn2.respository;

import com.geekq.springbootlearn2.annotation.FirstLevelRepository;
import com.geekq.springbootlearn2.annotation.SecondLevelRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @author 邱润泽
 */
//@FirstLevelRepository(value = "MyFirstLevelRepository")//bean 实体

@SecondLevelRepository(value = "MyFirstLevelRepository")//bean 实体
public class MyFirstLevelRepository {

}
