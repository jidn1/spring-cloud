package com.fallback;

import org.springframework.http.client.ClientHttpResponse;

/**
 * @Copyright © 北京互融时代软件有限公司
 * @Author: Jidn
 * @Date: 2020/5/12 16:42
 * @Description:
 */
public interface ZuulFallbackProvider {

    public String getRoute();


    public ClientHttpResponse fallbackResponse();
}
