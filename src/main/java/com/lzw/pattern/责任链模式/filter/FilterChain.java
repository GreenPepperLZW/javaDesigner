package com.lzw.pattern.责任链模式.filter;

import com.lzw.pattern.责任链模式.filter.common.Request;
import com.lzw.pattern.责任链模式.filter.common.Response;
import com.lzw.pattern.责任链模式.filter.filter.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    // 链式调用
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
