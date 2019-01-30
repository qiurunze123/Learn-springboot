package com.geekq.springbootlearn3.respository;

import com.geekq.springbootlearn3.annotation.SecondLevelRepository;

/**
 * @author 邱润泽
 */
//@FirstLevelRepository(value = "MyFirstLevelRepository")//bean 实体

@SecondLevelRepository(value = "MyFirstLevelRepository")//bean 实体
public class MyFirstLevelRepository {

}
