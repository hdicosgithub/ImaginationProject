package com.hdicos.baidu.Collections.hashtable;

import java.util.LinkedList;
import java.util.function.IntToDoubleFunction;

/**
 * @author hds
 * @version 1.0.0
 * @ClassName SingleIntSet.java
 * @Description 计算机上实现O（1）查找
 * @createTime 2022年02月09日 14:53:00
 */
public class SingleIntSet4 {
    private Object[] _values=new Object[10];

    private  int H(int value){
        if(value>=0&&value<=9){
            return value;
        }
        else
        return value-10;
    }

    public void Add(int item){
        if (_values[H(item)]==null){
            LinkedList<Integer> ls=new  LinkedList<>();
            ls.addFirst(item);
        }else {
            //LinkedList<Integer> ls=_values[H(item)]
        }
        _values[H(item)]=item;
    }

    public void Remove(int item){
        _values[H(item)]=null;
    }
    public  boolean Contains(int item){
        if(_values[H(item)]==null){
            LinkedList<Integer> ls=new LinkedList<Integer>();
            ls.addFirst(item);
            _values[H(item)]=ls;
        }else {
            return (int) _values[H(item)] == item;
        }
        return false;
    }

    public static void main(String[] args) {
        SingleIntSet4 set=new SingleIntSet4();
        set.Add(3);
        set.Add(17);
        System.out.println(set.Contains(3));  // 输出true
        System.out.println(set.Contains(17));  //输出true
        System.out.println(set.Contains(13));  //输出false
        set.Add(13);
        System.out.println(set.Contains(13));  //输出false
        System.out.println(set.Contains(3));  //输出false

    }
    
}
