package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-04 18:34
 */
@RestController
@RequestMapping(value = "/service")
public class ServiceController {
    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response, @RequestBody  ServiceInfo serviceInfo){
        RestfulResult restfulResult = new RestfulResult();

        restfulResult.setData("000222222"+serviceInfo.getName());

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return  serviceInfo.getName()+"1111222222";
    }
}
