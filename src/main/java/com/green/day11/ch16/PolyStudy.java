package com.green.day11.ch16;

public class PolyStudy {
    /*
    ❗❗❗[다형성의 특징]❗❗❗
    다형성을 이해할때 멤버필드도 이해해야하나, 은니고하로 직접 사용을 하지 않기 때문에 멤버메소드가 어떻게
    동작하는지 이해하면 된다. 고로 아래 3가지만 기억하면 된다.

    1. 부모 타입의 변수는 자식 객체 주소값을 저장할 수 있다.

    2. 1번의 반대는 안된다. 자식 타입의 변수는 부모객체 주소값 저장할 수 없다.

    3. 타입은 호출할 수 있냐 없냐(아는 메소드만 호출 가능, 모르는 메소드는 호출 불가)를 구분하고, 호출이 된다면 객체 기준(우리가 원래 알던대로 동작).
        안다, 모른다 구분은 해당 메소드를 가지고 있냐 없냐로 구분(상속 받은 메소드도 알고 있는 메소드로 본다)

    4. 레퍼런스 변수끼리의 형변환은 상속관계에서만 가능하다.
     */
    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.crying();

        System.out.println("-------1-----");

        //1) ex) 부모 타입의 변수는 자식 객체 주소값을 저장할 수 있다.

        Animal anil=new Cat();
        Animal anil2=new Dog();
        Animal anil3=new BullDog();
        Animal anil4=new Bird();
        Dog dog1=new BullDog();
        System.out.println("--------2-----");


        //2) ex)1번의 반대는 안된다. 자식 타입의 변수는 부모객체 주소값 저장할 수 없다.

//        BullDog dog2=new Dog(); 불가
//        BullDog bullDog2=(BullDog) anil2; // anil2 는 Dog 객체의 주소값이 들어있으므로 자식 타입의
        // 자식 타입인 BullDog 에 부모 객체인 Dog 객체 주소값을 담으려고 하니 런타임 에러 발생

        BullDog bullDog3=(BullDog) dog1; //dog1 에는 Bulldog 객체의 주소값이 저장되어 있으므로 형변환 하여 BullDog 타입의 주소값으로 형변환 하여 넣을 수 있다.


        //3)

        //anil3.jump(); 작동 안된다.
        //anil3에는 Bulldog 객체 주소값이 저장되어 있으나, Animal 은 jump 메소드를 모르기 때문에(존재하지 않기 때문에) 호출할 수 없다.
        //그래서 그 메소드를 알고 있는 타입으로 형변환 해줘야한다.

        BullDog bullDog4=(BullDog) anil3; // Animal type 을 강제 형변환을 통해 BullDog 타입으로 형변환 한것.
        bullDog4.jump();
        System.out.println("-----3----");

        anil3.crying();
        bullDog4.crying();

        System.out.println("-------4-------");

       //instanceOf: 형변환 가능여부, 가능하면 true, 불가능 하면 false
        //왼쪽항: 객체주소값, 오른쪽항: 타입(Class)
        //가능: 타입과 동일한 객체이거나 자식 객체 이면 가능
        //불가능: 가능의 반대

        System.out.println(anil3 instanceof BullDog);//true
        System.out.println(anil3 instanceof Dog);//ture
        System.out.println(anil4 instanceof BullDog);//false
        System.out.println(anil4 instanceof Bird);//true



        /*
        불독은 jump 메소드를 알고 있는데 Dog는 jump메소드 안가지고 있기 때문에 호출이 만약에 된다면 에러가 터진다.
        그래서 자바는 애초에 자식타입이 부모객체 주소값이 담기지 않도록 되어있다. 강제로 저장하려고 하면 런타임 에러가 발생
         */
//        BullDog b=new Dog();
//        b.jump();









    }


}

class Animal{
    void crying(){
        System.out.println("동물이 운다");
    }
}

class Cat extends Animal{
    @Override
    void crying(){
        System.out.println("야옹 야옹");
    }
}

class Dog extends Animal {
    @Override
    void crying() {
        System.out.println("월 월");
    }
}


class BullDog extends Dog{
    @Override
    void crying(){
        System.out.println("멍 멍");
    }
    void jump(){
        System.out.println("불독이 점프 점프");
    }

}

class Bird extends Animal{
    @Override
    void crying(){
        System.out.println("까악 까악");
    }


}