package com.green.day01.ch02;

public class StudyVariableNaming {
    public static void main(String[] args) {

        // <변수 명명규칙>
         //1. 대소문자 구분, 길이 제한 없음
        int abc,abC; // 둘은 다른 변수이다.

        //2. 예약어를 사용하면 안된다.
        // 예약어: 이미 기능의 약속이 되어 있는 단어(에디터창에서 파란색으로 표시된다.)
        // class,void.. 등등 변수명으로 사용 불가

        //3. 숫자로 변수명 시작 불가
        // int 1avc;


        //4. 특수기호는 달러,언더바만 가능
        // $,_


        //5. camelCase 기법을 사용, 변수명 사용 단어들 hello, my, name, is hong
        int helloMyNameIsHong;

        //변수와 메소드(함수명)는 camelCase 기법 사용
        // 클래스는 PascalCase 기법 사용

        /*
        6. 낙타 대문자(camelCase):
        첫 번째 단어는 소문자로 시작하고, 그 다음 단어의 첫 글자는 대문자로 작성합니다.
        변수명: userAge, totalPrice
        함수(매서드)명: calculateSum(), getUserName()
        예: myVariableName, calculateTotalAmount


        7. 파스칼 대문자(PascalCase):
        단어의 첫 글자를 대문자로 작성합니다.
        주로 클래스 이름에 사용됩니다.
        예: MyClassName, EmployeeRecord

        8. SNAKE_CASE 기법
        상수 표현
        예: final int MAX_SIZE
         */



    }
}
