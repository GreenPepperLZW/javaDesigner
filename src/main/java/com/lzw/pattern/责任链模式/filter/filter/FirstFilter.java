package com.lzw.pattern.责任链模式.filter.filter;

import com.lzw.pattern.责任链模式.filter.FilterChain;
import com.lzw.pattern.责任链模式.filter.common.Request;
import com.lzw.pattern.责任链模式.filter.common.Response;

/**
 * 具体过滤器1
 *
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {

        System.out.println("过滤器1 前置处理");

        // 先执行所有request再倒序执行所有response
        chain.doFilter(request, response);

        System.out.println("过滤器1 后置处理");
    }
}
