package com.green.day08.ch13;

public class ArrayInstance2 {
    public static void main(String[] args) {

        // ❗❗❗객체의 주소값을 담을 수 있는 배열을 만드는 과정 ❗❗❗

        Box[] arr=new Box[5];//type 에 우리가 밑에서 만든 class 를 적어 줄 수 있다
        //위는 마치 Box b0,b1,b2,b3,b4; 이렇게 표현할수 있다. 각 공간에는 Box 객체의 주소값이 들어갈 수만 있다.


        //Box b1=new Box();//기본 생성자가 없어서 빨간줄이 뜬다
        Box b1=new Box("안녕");

        System.out.println(b1); // com.green.day08.ch13.Box@404b9385 -> 밑의 Box 클래스 안에 String 가 없엇으면 이렇게 뜬다
        System.out.println(b1.toString());

        arr[0]=b1;
        arr[1]=new Box("안녕하세요");
        arr[2]=new Box("반갑습니다");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}

class Box{
    private String conts;

    Box(String conts){
        this.conts=conts;
    }


    @Override
    public String toString(){ //System.out.println(참조변수), 여기서 결과값이 원하는 결과값이 나오게 하려면 이 코드를 써야한다.만약 안쓰면 위에처럼 주소같은것이 나옴
        return conts;
    }
    //오버라이딩, 상속관계를 배워야 알 수 있다. 부모가 가진 메소드를 그냥 쓸 수 있는데 내가 새롭게 정의하고 싶다
    //모든 클래스는 Object 클래스를 상속받는다. 그래서 우리가 알지 못하는 메소드를 쓸 수 있다.


}
