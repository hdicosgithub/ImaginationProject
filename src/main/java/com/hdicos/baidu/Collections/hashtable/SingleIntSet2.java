package com.hdicos.baidu.Collections.hashtable;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName SingleIntSet.java
 * @Description 计算机上实现O（1）查找
 * @createTime 2022年02月09日 14:53:00
 */
public class SingleIntSet2 {
    private Object[] _values=new Object[10];

    private  int H(int value){
        return value-10;
    }

    public void Add(int item){
        _values[H(item)]=item;
    }

    public void Remove(int item){
        _values[H(item)]=null;
    }
    public  boolean Contains(int item){
        if(_values[H(item)]==null)
            return  false;
        else
            return (int) _values[H(item)]==item;
    }

    public static void main(String[] args) {
        SingleIntSet2 set=new SingleIntSet2();
        set.Add(13);
        set.Add(17);
        System.out.println(set.Contains(13));  // 输出true
        System.out.println(set.Contains(15));  //输出false

    }

}
