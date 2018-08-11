/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: RocketmqProperties
 * Author:   Lifeifei
 * Date:     2018/8/10 10:29
 * Description: 配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mq.rocketmq.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈配置类〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
@Setter
@Getter
@ConfigurationProperties(RocketmqProperties.PREFIX)
public class RocketmqProperties {
    public static final String PREFIX = "zebra.rocketmq";
    private String namesrvAddr;
    private String producerGroupName;
    private String transactionProducerGroupName;
    private String consumerGroupName;
    private String producerInstanceName;
    private String consumerInstanceName;
    private String producerTranInstanceName;
    private int consumerBatchMaxSize;
    private boolean consumerBroadcasting;
    private boolean enableHisConsumer;
    private boolean enableOrderConsumer;
//    private List subscribe = new ArrayList<>();
}