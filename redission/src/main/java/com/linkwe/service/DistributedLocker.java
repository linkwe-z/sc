package com.linkwe.service;

import java.util.concurrent.TimeUnit;

/**
 * Created by lwz on 2018/1/26.
 * desc: 定义Lock的接口类
 */
public interface DistributedLocker {
    void lock(String lockKey);

    void unlock(String lockKey);

    void lock(String lockKey, int timeout);

    void lock(String lockKey, TimeUnit unit , int timeout);
}
