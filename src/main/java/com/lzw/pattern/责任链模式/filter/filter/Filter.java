package com.lzw.pattern.责任链模式.filter.filter;

import com.lzw.pattern.责任链模式.filter.FilterChain;
import com.lzw.pattern.责任链模式.filter.common.Request;
import com.lzw.pattern.责任链模式.filter.common.Response;


/**
 * 模拟web过滤器Filter
 *
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public interface Filter {

    public void doFilter(Request req, Response res, FilterChain c);
}
