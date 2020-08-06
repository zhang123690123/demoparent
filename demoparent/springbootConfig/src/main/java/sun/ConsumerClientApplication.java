package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-05 10:56
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConsumerClientApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}
