package com.lzw.pattern.责任链模式.filter;

import com.lzw.pattern.责任链模式.filter.common.Request;
import com.lzw.pattern.责任链模式.filter.common.Response;
import com.lzw.pattern.责任链模式.filter.filter.FirstFilter;
import com.lzw.pattern.责任链模式.filter.filter.SecondFilter;

/**
 * 具体过滤器2
 *
 * @author : lzw
 * @date : 2022/1/11
 * @since : 1.0
 */
public class Client {
    public static void main(String[] args) {
        Request req = null;
        Response res = null;

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        filterChain.doFilter(req, res);
    }
}
