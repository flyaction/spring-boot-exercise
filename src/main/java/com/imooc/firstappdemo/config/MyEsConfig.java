package com.imooc.firstappdemo.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Action
 * @Description:
 * @Date Create in 2019/5/5 15:21
 */
@Configuration
public class MyEsConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {

        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9300
        );
        InetSocketTransportAddress node1 = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9301
        );
        InetSocketTransportAddress node2 = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9302
        );

        Settings settings = Settings.builder()
                .put("cluster.name", "action")
                .build();

        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(node);
        client.addTransportAddress(node1);
        client.addTransportAddress(node2);

        return client;

    }

}
