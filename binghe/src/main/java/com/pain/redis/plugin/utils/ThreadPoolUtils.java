package com.pain.redis.plugin.utils;

import java.util.concurrent.*;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 线程工具类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ThreadPoolUtils {

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(16,
            16,
            30,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(4096),
            new ThreadPoolExecutor.CallerRunsPolicy());
    /**
     * execute task in thread pool
     */
    public static void execute(Runnable command){
        executor.execute(command);
    }

    public static <T> Future<T> shumit(Callable<T> task){
        return executor.submit(task);
    }

    public static void shutdown(){
        if (executor != null){
            executor.shutdown();
        }
    }
}
