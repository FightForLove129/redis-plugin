package com.pain.redis.plugin.data;

import java.time.LocalDateTime;

/**
 * @Author：tdpain
 * @Date: 2026/1/22
 */
public class RedisData {
    //实际业务数据
    private Object data;
    //过期时间点
    private LocalDateTime expireTime;

    public RedisData() {
    }

    public RedisData(Object data, LocalDateTime expireTime) {
        this.data = data;
        this.expireTime = expireTime;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }
}
