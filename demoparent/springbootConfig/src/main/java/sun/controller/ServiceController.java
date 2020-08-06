package sun.controller;


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


    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return  serviceInfo.getName()+"1111";
    }
}
