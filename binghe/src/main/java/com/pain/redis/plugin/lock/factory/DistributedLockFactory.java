package com.pain.redis.plugin.lock.factory;

import com.pain.redis.plugin.lock.DistributedLock;

/**
 * @Author：tdpain
 * @Date: 2026/1/22
 */
public interface DistributedLockFactory {
    /**
     * 根据key获取分布式锁
     */
    DistributedLock getDistributedLock(String key);
}
