package com.hdicos.baidu.domian;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2021年06月23日 16:35:00
 */
public class Person implements Serializable, Comparable<Person> {
    private String name;
    private Integer age;


    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        if (this.age > person.age) {
            return 1;
        }
        if (this.age < person.age) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeMap<Person, String> personStringTreeMap = new TreeMap<>();
        personStringTreeMap.put(new Person("项羽", 24), "xiangyu");
        personStringTreeMap.put(new Person("孙权", 18), "sunquan");
        personStringTreeMap.put(new Person("刘备", 40), "liubei");
        personStringTreeMap.put(new Person("姜子牙", 80), "姜子牙");
        Set<Person> keys = personStringTreeMap.keySet();
        for (Person key : keys) {
            System.out.println(key.getAge() + "-----" + key.getName());
        }
    }


}
