package com.hdicos.baidu.java8newfeatures.interfaceClass;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName Formula.java
 * @Description TODO
 * @createTime 2021年06月28日 10:37:00
 */
interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
    }
}
