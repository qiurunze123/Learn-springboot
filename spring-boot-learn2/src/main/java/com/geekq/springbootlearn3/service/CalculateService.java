package com.geekq.springbootlearn3.service;

/**
 * 计算服务
 * @author 邱润泽
 */
public interface CalculateService {

    /**
     * 多个数求和
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}
