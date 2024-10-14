package com.green.day04.ch06;

public class MethodStudy {
    /*
    -아래 메소드를 main 메소드라고 부른다.
    -메소드를 만드는 행위는 메소드를 정의했다고 표현한다.
    -만든 메소드를 사용하는 행위를 메소드를 호출했다 표현.
    -메소드 이름은 이름이라서 호출할 때 사용한다.
    -메소드는 무조건 return 을 만나야한다. 하지만 void 메소드는 return 이 없지만 자동으로 return 이 생겨서 호출한 곳으로 돌아간다.


    public, static 은 나중에 설명-객체에서 설명

    [1] 아래 3가지가 method 구성요소이다.

    1),2),3) 이 선언부이다.

    1)void: 리턴타입
    -메소드가 호출된 후 결과값


    2)main: 메소드명
    -호출할 때 사용


    3)(String[] args): 영어로는 parameter, 한글로는 매개변수
    -메소드를 호출할 때 메소드에 보내는 데이터
    -호출할 때마다 변수의 값이 바뀔 수 있으므로 매개변수라 명명한다.
    -메인메소드에서 보내는 데이터는 인자(argument)라 한다.


    4){}: 구현부
    -호출되었을때 실행되는 부분


    [2] type 이 없는 언어들은 리턴타입이 빠진다- 자바스크립트가 이에 해당

    [3] 리턴타입+메소드명+파라미터(매개변수): 선언부

    [4] 추상 클래스는 선언부만 사용한다.

    [5] 메소드를 크게 두 분류
    -void 메소드: 리턴하는 값이 없다(결과 값이 없다) 즉 메소드가 호출되었다가 다시 return 하는데 이때 데이터를 가져가지 않는다.
    , void 메소드는 단독으로 있어야한다. = 이 있으면 안된다. 그래서 메소드 호출부분만 있으면 void메소드 로 알 수 있다.

    -비void 메소드: 리턴하는 값이 있다(결과 값이 있다)

    순서: 메소드를 정의하고, 메소드를 사용한다.

     */

    public static void main(String[] args) {
        //이 메인 메소드는 컴파일러가 자동으로 호출한다.
        sum(5,7); // sum 메소드를 호출(사용)한것.// void 메소드 호출(사용)
        sum(15,17); // sum 메소드를 호출(사용)한것.
        //원래는 MethodStudy.sum(5,7) 을 써야한다. 하지만 같은 Class안에 있으므로 클래스 이름을 빼도 된다.
        returnMethod(5,7);
        int result=returnMethod(5,7);//비void 메소드 호출
        System.out.println("result:"+result);
        System.out.println("result2:"+returnMethod(15,17));
        MethodStudy.returnMethod(13,14);
        System.out.println(returnMethod(13,14));



    }

    /*
    - sum 이라는 이름의 static void 메소드를 정의한 것(파라미터(매개변수)는 2개이다)
    - 파라미터(매개변수)가 변수인 이유는 위의 메인메소드에서 메소드를 사용할때 메소드 안에 담기는 변수가 바뀔 수 있기 때문이다.
    - 파라미터(매개변수)를 선언할 때는 변수는 변수마다 type 을 선언해야한다.
    - void 메소드:리턴하는 값이 없다.(결과값이 없다).실행커서가 단독으로 호출한 곳으로 돌아간다.
    - 비void 메소드: 리턴하는 값이 있다.(결과값이 있다), 리턴한다는 것이 호출할 method 안에서 계산된 결과가 메인 메소드 안의 호출한 method에 값이 리턴된다.
     */

    static void sum(int n1,int n2){
        System.out.printf("%d + %d = %d\n",n1,n2,(n1+n2));
    }



    static int returnMethod(int n1, int n2){ // 비void 메소드 이름의 리턴타입은 모든 변수가 들어갈 수 있다.(자료형 변수, 참조변수)
        return n1+n2;// 실행커서가 여기로 왔다가, 데이터를 가지고 returnMethod(5,7)으로 간다. 즉, 위의 returnMethod(5,7)이라는 값에 메소드의 결과가 저장이 된다.
    }
}
