package com.cyw.demo.rtti;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/20
 * @description:
 */
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
            this.type = type;
    }

    public List<T> createList(){
        List<T> list = new ArrayList<T>();
        try{
            for (int i = 0; i < 9; i ++){
                list.add(type.newInstance());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        FilledList<Number> filledList = new FilledList<Number>(Number.class);
        List<Number> list = filledList.createList();
        System.out.println(list);

    }
}
