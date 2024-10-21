package com.green.day09.ch13;

public class VariableArguments {
    //❗❗가변인자❗❗
    public static void main(String[] args) {
        sum(1,2); // 3
        //sum 메소드 호출: 아규먼트 정수값 2개를 보내고 있다.
        //void 메소드(혼자 있음)
        //클래스메소드 or 인스턴스 메소드: 객체 생성 부분이 없기 때문에 클래스 메소드(static)

        sum(10,22,33);


        sumVar(1);
        sumVar(1,2);
        sumVar(1,2,3);
        sumVar(1,2,4,5,2,15);


    }


    /*
    가변인자는 인자를 같은 타입의 변수를 수십개, 수백개 보낼수 있다.
    인자가 자동으로 배열으로 바뀌어서 메소드의 파라미터로 넘어간다.
    즉 메소드명(int... values)
    v

     */
    static void sumVar(int ... values){
        int sum=0;
        for(int i=0;i<values.length;i++){ //values 를 배열변수명으로 생각하면 된다. 그래서 배열
            sum=sum+values[i];
        }
        System.out.println(sum);

    }

    static void sum(int i,int j){
        System.out.println(i+j);
    }

    static void sum(int i,int j, int k){
        System.out.println(i+j+k);
    }

}
