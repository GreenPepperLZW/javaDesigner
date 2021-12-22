package com.lzw.principles.里氏替换原则.demo2;

/**
 * 四边形接口
 *
 * @author : lzw
 * @date : 2021/12/22
 * @since : 1.0
 */
public interface Quadrilateral {

    /**
     * 获取长度
     *
     * @return 四边形长度
     */
    double getLength();

    /**
     * 获取宽度
     *
     * @return 四边形宽度
     */
    double getWidth();
}
