package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-05 9:32
 */
@SpringBootApplication
@EnableEurekaServer
public class ConsumerClientApplication {
    public static void main(String [] args){

        SpringApplication.run(ConsumerClientApplication.class,args);
    }
}
