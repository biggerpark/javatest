package com.green.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        /*
        DBox<String,Integer>{
         private String left;
         private String right;

         void setter(String left,Integer right){
            this.left=left;
            this.right=right;
            }

          위처럼 작성된 class를 객체화 한 것과 같은 효과가 난다.
         */
        DBox<String,Integer> box=new DBox<>(); // 이 객체는 String, 정수 로 정해졌다.
        box.setter("Apple",25);
        System.out.println(box);


        System.out.println("----------------");

        DBox<Integer,Apple> box2=new DBox<>();

        Apple apple=new Apple();
        box2.setter(4,apple);

        System.out.println(box2);



    }
}
class DBox<L,R>{
    private L left;
    private R right;



    void setter(L left,R right){
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString(){
        return String.format("%s & %s",left,right);
    }
}
