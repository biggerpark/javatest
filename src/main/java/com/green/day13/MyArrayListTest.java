package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size()); // 0
        list.add(10);
        System.out.println(list);//[0] Q1)메소드를 부를때 마다 공간이 늘어나게 해주세요
        System.out.println(list.size());//1
        list.add(20);
        System.out.println(list);//[0,0]Q1)메소드를 부를때 마다 공간이 늘어나게 해주세요
        System.out.println(list.size());//2
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());//3
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());//4
        list.clear();
        System.out.println(list);//[]
        System.out.println(list.size());//0

    }
}

class MyArrayListTest2{
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int removeValue=list.remove(); //마지막 방에 있는 값은 리턴, 마지막 방도 없애야함, 즉 size()는 3이 되어야함

        System.out.println(removeValue);
        list.size();
        System.out.println(list);//[10,20,30]

    }
}
