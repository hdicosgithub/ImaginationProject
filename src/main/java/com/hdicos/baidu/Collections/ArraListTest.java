package com.hdicos.baidu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName ArraListTest.java
 * @Description TODO
 * @createTime 2021年06月23日 16:24:00
 */
public class ArraListTest {
    public static void arrayListComparator() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组：");
        System.out.println(arrayList);
        //反转
        // 测试修改上上传
        Collections.reverse(arrayList);
        System.out.println("collections.reverse(arrList)：");
        System.out.println(arrayList);
        //自然排序的升序排序
        Collections.sort(arrayList);
        System.out.println("自然升序的结果" + arrayList);
        Collections.sort(
                arrayList, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                }
        );
        System.out.println("定制" + arrayList);
    }


    public static void main(String[] args) {
       // arrayListComparator();
        /**** 测试查看自增自减的效果****/
        /*int a=1;
        int b=0;
        b=++a;
        //b=a++;
        System.out.println(b);
        System.out.println(a);*/
        /*****1、没有覆盖equals()的情况 ***/
        Person p1=new Person("eee",100);
        Person p2=new Person("eee",100);
        Person p3=new Person("aaa",200);
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        System.out.printf("p1.equals(p3) : %s; p1(%d) p3(%d)\n", p1.equals(p3), p1.hashCode(), p3.hashCode());
    }

    private static  class Person{
        int age;
        String name;
        public Person(String name ,int age ){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return  name+"==="+age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
