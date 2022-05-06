package com.hdicos.baidu.Collections.hashtable;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName SingleIntSet.java
 * @Description 计算机上实现O（1）查找
 * @createTime 2022年02月09日 14:53:00
 */
public class SingleIntSet {
    private Object[] _values=new Object[10];
    public void Add(int item){
        _values[item]=item;
    }
    public void Remove(int item){
        _values[item]=null;
    }
    public  boolean Contains(int item){
        if(_values[item]==null)
            return  false;
        else
            return (int) _values[item]==item;
    }

    public static void main(String[] args) {
        SingleIntSet set=new SingleIntSet();
        set.Add(3);
        set.Add(7);
        System.out.println(set.Contains(3));  // 输出true
        System.out.println(set.Contains(5));  //输出false
    }
}
