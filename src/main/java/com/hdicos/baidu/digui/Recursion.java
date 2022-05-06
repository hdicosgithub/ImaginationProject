package com.hdicos.baidu.digui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName ecursion.java
 * @Description TODO
 * @createTime 2021年06月17日 17:45:00
 */
public class Recursion {
    //数据的阶乘
    public static int digui(int n) {
        int[] ints;
        if (n == 1 || n == 0) {
            return n;
        } else {
            return n * digui(n - 1);
        }
    }

    public static Map<String, String> diguimap(int n) {
        Map<String, String> map = new HashMap<String, String>();
        return map;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
      /*  System.out.println(digui(4));
        int x=10 ;
        String y="hello";
        A a=new A(100);
        myfun(x,y,a);
        x=15;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);*/
        /*

        x、y、a 为什么打印的值是？为什么是？
        *   10   为什么x是答应的是10，因为Java是按值调用，按值传递。所以myfun的调用不会影响intx 的值，但是对象调用
            hello
           A{xx=200}
        * */
        //generics();
        // genericsMethodUse();
       /* Integer[] myArray={1,2,3};
        int[] myArraya={1,2,3};
        //System.out.println(arraryTolist(myArray).getClass());
        //方法二
      //  List list =new ArrayList(Arrays.asList("a","b","c"));
        //System.out.println(list);
        List mylist=Arrays.stream(myArray).collect(Collectors.toList());
        ///基本类型也可以实现转换（依赖boxed的装箱操作）
        List mylist1=Arrays.stream(myArraya).boxed().collect(Collectors.toList());
         */
        //数组反转
       /* String[] s=new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list=Arrays.asList(s);
        Collections.reverse(list);
        s=list.toArray(new String[0]);*/

        //获取class对象的四种方式
        // 1 .知道具体的类情况下使用
        // 不会对对象进行实例化
        Class targetObjectClass = TargetObject.class;
        // 2.通过Class.forName() 传入类的路径获取
        Class secondClass = Class.forName("com.hdicos.baidu.digui");
        // 3.通过对象实例获取instance.getClass()
        TargetObject targetObject = new TargetObject();
        Class threeClass = targetObject.getClass();
        // 4 类加载器传入类路径
        // Class fourClass=ClassLoader.loadClass("com.hdicos.baidu.digui");

    }

    /**
     * 方法一
     * 自己手写转换数组
     *
     * @param array
     * @param <T>
     * @return
     */
    static <T> List<T> arraryTolist(final T[] array) {
        final List<T> l = new ArrayList<T>(array.length);
        for (final T s : array) {
            l.add(s);
        }
        return l;
    }

    public static void myfun(int i, String str, A a) {
        i = 20;
        str = "java";
        a.xx = 200;
    }

    static class A {
        int xx;

        public A(int x) {
            xx = x;
        }

        @Override
        public String toString() {
            return "A{" +
                    "xx=" + xx +
                    '}';
        }
    }

    /**
     * 泛型的直接添加
     */
    public static void generics() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        // list.add("a");
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
        //通过反射添加
        add.invoke(list, "aaaaa");
        System.out.println(list);
    }

    public void Instantiation() {
        Generics<Integer> integerGenerics = new Generics<Integer>(132456);
    }

    public static void genericsMethodUse() {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"hello", "world"};
        Generics.printArray(intArray);
        Generics.printArray(stringArray);


    }

    // 对文件的递归遍历

    // 用简单的Java代码实现面向对象的封装、继承、多态、重载
}
