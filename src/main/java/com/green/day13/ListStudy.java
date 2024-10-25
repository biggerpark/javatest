package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

    /*
    Generic 배우기 전

    1)  List 는 인터페이스이다. 인터페이스는 객체화 불가능하다.


    2)  인터페이스는 부모역할만 한다. List를 상속받은 class가 있다.
        상속받은 class는  LinkedList, ArrayList 이다.

    3)  둘 class는 결과는 똑같은데 처리방식이 다르다.

    4)  LinkedList 는 Node 방식으로 데이터를 다루고
        ArrayList 는 Array(배열) 방식으로 데이터를 다룬다.
        LinkedList 는 수정 위주의 작업이 많으면 유리하고, ArrayList는 읽기 위주의 작업이 많으면 유리하다.


    5)  List 변수명=new ArrayList();
        List 변수명=new LinkedList();
        이렇게 작성이 가능하다. List 는 객체화가 불가능하고, 자식 class 들은 객체화가 가능하다.
        왼쪽 타입은 그냥 List 를 쓰면 된다. List 를 쓰면 유연하게 쓸 수 있기때문에 List 타입으로 담으면 된다.
     */

    public static void main(String[] args) {
        //1) 넣는방법
        List list=new ArrayList();
        list.add(10);//add 메소드를 사용하면 사용할때 10이 list 에 그때 추가된다.//0번방에 10값이 주입
        list.add(20);//1번방에 20값이 주입

        ArrayList list2=(ArrayList)list; //이렇게 굳이 쓰진 않는다. 왜냐하면 List 클래스가 아는 메소드만 사용하기 때문이다. 이건 shallow copy이다. 주소값이 동일해진다.
        list2.add(30); // add 의 타입은 아무것도 지정안하면 object 타입으로 되어있다. 이 타입은 모든 타입을 받을 수 있다.//2번방에 값이 주입
        list2.add("하하");//3번방에 값이 주입




        int[] arr=new int[3];
        //arr[0]="하하"

        Object[] arr2=new Object[4];
        arr2[0]=10;
        arr2[2]="하하";
        //1)-1 Object 클래스의 배열이기 때문에 모든 타입의 값들이 배열에 들어갈 수 있다. 위의 add 도 매개변수가 Object 로 되어있으므로 모든 타입을 받을 수 있다.


        //2) 빼내는 방법
        list.get(0);
        int val0=(int)list.get(0);// 2)-1 list.get(object) 이렇게 되어있는데 return type 이 object 이다. 이걸 int 로 맞춰줘야 하므로 int 로 형변환 해준다.
        //2)-2 object 변수는 모든 타입으로 형변환이 가능하다.
        System.out.println("val0:"+val0);

        list.get(3);
        String val3=(String) (list.get(3));
        System.out.println("val3:"+val3);


        System.out.println(list);
        System.out.println(list2);
    }
}
