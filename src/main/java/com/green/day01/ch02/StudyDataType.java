package com.green.day01.ch02;

public class StudyDataType {
    public static void main(String[] args) {
        /*
        자료형: 정수형,실수형,불린형,문자형
        특징: 타입이름이 소문자로 되어있고, 총 8개이다. 기본타입을 제외한 나머지는 reference type(참조 타입)이다.


        *타입명 옆에 숫자는 바이트(크기)를 의미한다.
        #정수형(4가지): byte(1),short(2),int(4),long(8)   int 로 저장 안되는 큰 정수는 long 으로 저장
        #실수형: float(4),double(8)
        #불린형: boolean(1)
        #문자형: char(2)           (string 은 문자열이다)

         자동형변환 방향: byte->short->int->long->float->double

         */ // 밑에는 자동형변환의 예시

        byte var1=127;
        short var2=300;
        int var3=var1+var2; // byte 와 short type 이 int type 으로 자동형변환

        int var4=100;
        float var5=var4+var4; // int type 을 float type 에 넣으려고 할때, int type 이 자동형변환이 되어 float type 이 된다.

        int var6=(int)var5; // 이 경우는 float type 인 var5를 int type 으로 강제형변환 해주는것.





    }
}
