package sun.client;

import com.netflix.ribbon.proxy.annotation.Content;
import common.entity.RestfulResult;
import org.springframework.stereotype.Component;
import sun.entity.ServiceInfo;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-05 15:02
 */
@Component
public class ServiceFallback implements ServiceFeignClient{


    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}
