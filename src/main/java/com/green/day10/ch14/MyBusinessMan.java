package com.green.day10.ch14;

public class MyBusinessMan {
    public static void main(String[] args) {
        /*
        상속에 대해 공부해보자
        특징-상속은 클래스 하나만 상속할 수 있다. 여러명의 부모를 가질 수 없다
        */

        //7)예제로 이해해보자
        BusinessMan man1=new BusinessMan("YOON","Hybrid ELD","Staff Eng");
        System.out.println(man1.getCompany());

        man1.tellYourSelf();//8) BusinessMan 클래스 안에는 tellYourSelf 메소드가 없지만 호출할 수 있다. Man 클래스로부터 상속을 받았기 때문이다.
        System.out.println(man1.toString());//9)Object 로부터 상속을 받기 때문에 toString 메소드를 호출할 수 있다.

        man1.jump();//11)

        man1.whatIsDoing(); // 18)부모 클래스 가 가진 메소드를 바로 호출하게 된다.
        //19) man1.super.jump(); super.은 메소드 밖에서 사용할 수 없다. 메인메소드 안에서 등 등..

        /*20) 상속관계는 무수히 이루어질 수 있다.이때 중요한건 상속 관계에 있는 모든 클래스의 객체화가 이루어진다.
        "참조변수.메소드"를 하게 되면 가장 가까운 객체의 메소드를 호출한다.(부모,자식의 클래스 안에 똑같은 메소드가 있다고 가정했을때)

        * */


    }
}
class Man{ // 4) 상속 키워드를 생략하면 클래스 옆에 "extends Object" 가 자동으로 붙는다. 모든 클래스는 최상위 부모를 Object 를 가진다.
    private String name;

    public Man(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void tellYourSelf(){
        System.out.printf("제 이름은 %s 입니다\n",name);
    }

    public void jump(){ //10)이런 메소드를 만들어보자
        System.out.printf("%s이가 점프\n", name);
    }
}

class BusinessMan extends Man{ // 1) BusinessMan 클래스가 Man 클래스를 상속받을것이다(extends 사용)
    private String company;
    private String position;

    public BusinessMan(String name,String company, String position) { // 2)super(); 이렇게 하면 빨간줄이 뜨는 이유:
        //3) 상속을 받으면 super(); 라는 코드가 자식의 클래스의 생성자에 자동 생성된다.this. 는 나자신이고 super() 는 내 부모의 생성자를 호출하는것.
        //4) 상속받기 위해서 자동으로 부모의 생성자 호출 코드를 호출한다. 이때 부모의 기본 생성자가 작성되어 있지 않다면 빨간 줄이 뜬다.
        /*
        5) 해결방법은 2가지이다.
              1. 부모 클래스에 기본 생성자를 만들어준다.
              2. 만들어져있는 생성자를 쓰면된다.(수동으로 작성해줘야한다)-자식의 생성자의 매개변수를 부모가 가진 생성자의 매개변수를 받을 수 있도록 추가해준다
        6) super(); 는 생성자의 가장 위에 작성이 되어야 한다.(주의!!)
         */
        super(name);//❗❗❗부모 생성자 호출을 통해서 부모 객체를 같이 메모리에 올림.❗❗❗, 만약 아무것도 적지 않으면 자동으로 super(); 가 들어간다. 하지만 이렇데 될려면 부모클래스에도 기본생성자가 있어야된다.
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void jump(){ //12)자식 클래스에 똑같이 메소드를 만들어보자
        System.out.printf("%s에 다니는 %s가 점프\n", company, getName());
        //13) name 은 부모 클래스에서 private 이기 때문에 바로 접근할 수 없다.
        //14) public 으로 상속받은 getName 메소드를 호출하여 이름값을 얻는다. 상속받으면 앞에 클래스가 안붙어도 메소드를 불러올 수 있다.
        //15) ❗❗ 이것을 오버라이딩 했다고 한다.❗❗ 오버라이딩이란 부모가 가진 메소드를 그대로 사용하는 것이 아니라 내가 재정의한 메소드를 사용하게끔 하는 기법이다.
    }

    public void whatIsDoing(){//16) 부모가 가진 메소드를 바로 호출하는 메소드를 만들고 싶으면 어떻게 할까
        super.jump(); // 17)부모가 가지고 있는 메소드를 호출하고 싶으면 super. 을 이용하면 된다.
        //17-1) super. 은 부모의 멤버필드, 멤버메소드에 접근할때 사용한다.
    }
}