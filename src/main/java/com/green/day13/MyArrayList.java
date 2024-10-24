package com.green.day13;

public class MyArrayList {
    private int[] arr;
//    public int count=1;//A1)내가 해결했던 방법- count 를 전역변수로 설정해두고 메소드 부를때마다 count 가 늘도록 한 방법

    public MyArrayList(){
//        arr=new int[4];
//        arr[0]=2;
//        arr[1]=3;
//        arr[2]=4;
//        arr[3]=5;
//        arr=new int[0];
        clear(); //clear() 을 활용하여 배열 초기화

    }

    @Override
    public String toString(){// 0) 우선 arr 배열 안의 값들을 출력하기 위한 toString()을 오버라이딩 하여 재정의해준다.
        StringBuilder str=new StringBuilder();
        str.append("[");
        for(int i=0;i<arr.length;i++){
            str.append(this.arr[i]);
            if(i!= arr.length-1){
            str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

//    public void getEx(){
//        System.out.println(arr);
//    }  add()에서 계속 새롭게 만들어지는 tmp 의 주소값은 모두 다르다는 것을 증명해주는 메소드(그냥 내가 궁금해서)

    public void add(int num){
        int[] tmp=new int[arr.length+1];
        tmp[arr.length]=num;//1) num 으로 받은 값을 추가
        for(int i=0;i<arr.length;i++){ //2) 기존의 arr 에 있는 값을 tmp 에 넣어주는 것(deep copy).그러면 새로운 tmp 가 생성되도 값은 유지가 될것.
            tmp[i]=arr[i];
        }
        arr=tmp; // A1) 이 배열 안에 값을 넣어야하기 때문에 변수를 둘로 나누어준다.

//        arr=new int[arr.length+1]; // A1) 기존의 arr 크기의 한칸만 더 추가하면 기존 arr 배열의 길이에서 1칸씩 추가된 배열이 나오게 된다.
//        arr=new int[count++]; // A1) 내가 해결햇던 방법
    }

    public int size(){
        return arr.length;
    }
    public void clear(){
        arr=new int[0];//배열의 요소를 초기화할 때는 루프를 통해 각 요소에 접근하거나, 새로운 배열을 생성하여 재할당해야 합니다.
//        arr={}; //문법적으로 옳지 않음.
    }


    //다시 해보기(마지막 값을 돌려주고 그 빠진 자리는 리스트에서 지워보자)
    public int remove(){
        int[] temp=new int[arr.length-1];
        int last=arr[temp.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return last;
    }

}
