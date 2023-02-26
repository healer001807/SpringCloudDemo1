package com.example.eurekazuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-26 09:49
 **/
@Component
public class ZuulFilterConfig extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(ZuulFilterConfig.class);

    /**
     * 路由前校验
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 指定路由顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 执行过滤:true:过滤 false 不过滤
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @lombok.SneakyThrows
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            logger.warn("token is null");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.getResponse().getWriter().write("token is empty"); // 可自定义错误页
            return null;
        }
        logger.info("token is not empty");
        return null;
    }
}
