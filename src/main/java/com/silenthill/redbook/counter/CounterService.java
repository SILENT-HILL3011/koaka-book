package com.silenthill.redbook.counter;

import com.silenthill.redbook.entity.CounterConfig;

/**
 * 计数器统计服务
 */
public interface CounterService {
    int blurCount(CounterConfig counterConfig);
    int preciseCount(CounterConfig counterConfig);
}
