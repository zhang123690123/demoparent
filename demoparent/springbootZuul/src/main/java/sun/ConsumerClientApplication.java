package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-04 18:18
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RefreshScope   //开启配置更新功能
public class ConsumerClientApplication {

    public static void main(String [] args){
        SpringApplication.run(ConsumerClientApplication.class,args);
    }
}
