package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
      SuperCLS s1=new SuperCLS();
      SuperCLS s2=new SuperCLS();
      SubCLS sub1=new SubCLS();
      sub1.showCount();

        System.out.println(s2 instanceof SubCLS);

    }
}
class SuperCLS{
    protected static int count;

    SuperCLS(){
        count++;
    }
}

class SubCLS extends SuperCLS{
//    SubCLS(){
//        super();
//    } -> 이런 형태의 기본생성자가 자동으로 들어가기 때문에 super();로 인해 count 가 된다.
    void showCount(){
        System.out.println("count:"+count);
    }
}