package com;

import java.util.ArrayList;
import java.util.List;

public class shuiguochushihua {
    public static void chushi() {
        List <Fruig> list = new ArrayList<>();
        Fruig f1=new Fruig("苹果",8.0);
        list.add(f1);
        Fruig f2=new Fruig("草莓",13);
        list.add(f2);
        System.out.println("名称："+f1.getName()+"  价格:"+f1.getPrice()+"元/斤");
        System.out.println("名称："+f2.getName()+"  价格:"+f2.getPrice()+"元/斤");
    }

    public static void chushi1(){
        List <Fruig> list1 = new ArrayList<>();
        Fruig f1=new Fruig("苹果",8.0);
        list1.add(f1);
        Fruig f2=new Fruig("草莓",13);
        list1.add(f2);
        Fruig f3=new Fruig("芒果",20);
        list1.add(f3);
        System.out.println("名称："+f1.getName()+"  价格:"+f1.getPrice()+"元/斤");
        System.out.println("名称："+f2.getName()+"  价格:"+f2.getPrice()+"元/斤");
        System.out.println("名称："+f3.getName()+"  价格:"+f3.getPrice()+"元/斤");
    }
}