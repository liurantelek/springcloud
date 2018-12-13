package com.lr.Util;

import com.lr.EsConstants;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.xpack.client.PreBuiltXPackTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

//@Configuration
@Service
public class ElasticSearchConfig {
    static {
        System.out.println();
    }
//    @Bean(name = "client")
    public TransportClient transportClient()throws UnknownHostException {
        System.out.println("elasticSearchConfig容器初始化");
        return  client();
    }
    /**
     * 创建TransportClient
     * @return
     * @throws UnknownHostException
     */
    public static TransportClient client() throws UnknownHostException {
        String[] addresses = EsConstants.esAddress.split(",");
        TransportClient client=new PreBuiltXPackTransportClient(Settings.builder().put("cluster.name", EsConstants.esClusterName).put("xpack.security.user",EsConstants.esSecurityUser).build());
        for (String address:addresses) {
            String[]addressArr=address.split(":");
            String ip=addressArr[0];
            int port=Integer.valueOf(addressArr[1]);
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(ip),port));
        }

        return client;
    }

}
