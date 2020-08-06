package sun.client;

import common.entity.RestfulResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.entity.ServiceInfo;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-05 15:03
 */

@Component
@FeignClient(value = "springbootService",fallback=ServiceFallback.class)//这里的value对应调用服务的spring.applicatoin.name
public interface ServiceFeignClient {
    @RequestMapping(value = "/service/hello")
    RestfulResult hello(@RequestBody ServiceInfo serviceInfo);
}
