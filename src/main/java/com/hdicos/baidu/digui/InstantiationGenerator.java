package com.hdicos.baidu.digui;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName InstantiationGenerator.java
 * @Description TODO
 * @createTime 2021年06月21日 10:28:00
 */
public interface InstantiationGenerator<T> {
    public T method();

    class GeneratorImpl<T> implements InstantiationGenerator<T> {

        @Override
        public T method() {
            return null;
        }
    }
//
//    class   GeneratorImpl implements InstantiationGenerator<String>{
//
//        @Override
//        public String method() {
//            return null;
//        }
//    }


}
