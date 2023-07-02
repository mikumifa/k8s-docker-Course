package com.example.adminservice.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author: Garroshh
 * date: 2020/7/16 5:32 下午
 */
@Configuration
public class CustomRule extends AbstractLoadBalancerRule {

    private AtomicInteger nextIndex = new AtomicInteger(0);
    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }
    @Override
    public Server choose(Object key) {
        ILoadBalancer loadBalancer = getLoadBalancer();
        // 获取所有可达服务器列表
        List<Server> servers = loadBalancer.getReachableServers();
        if (servers.isEmpty()) {
            return null;
        }

        int serverCount = servers.size();
        int currentIndex = nextIndex.getAndIncrement() % serverCount;
        Server targetServer = servers.get(currentIndex);
        System.out.println(currentIndex);
        return targetServer;
    }
}
