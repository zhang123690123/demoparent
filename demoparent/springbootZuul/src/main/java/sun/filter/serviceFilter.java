package sun.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @description:
 * @author: zhangp
 * @date: 2020-08-05 17:14
 */
public class serviceFilter extends ZuulFilter {

    private static Logger log= (Logger) LoggerFactory.getLogger(serviceFilter.class);

    @Override
    public String filterType() {
        return "pre"; // 定义filter的类型，有pre、route、post、error四种
    }

    @Override
    public int filterOrder() {
        return 0;// 定义filter的顺序，数字越小表示顺序越高，越先执行
    }

    @Override
    public boolean shouldFilter() {
        return true;// 表示是否需要执行该filter，true表示执行，false表示不执行
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        System.out.println(token);
        if(token==null){
            log.config("there is no request token");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("there is no request token");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        log.info("ok");
        return null;
    }
}
