package com.green.day09.ch13;

public class EnhancedForInstance {
    public static void main(String[] args) {
        Product[] arr=new Product[4]; //Product 클래스의 객체의 주소값을 담을 수 있는 배열 선언
        arr[0]=new Product("Coffee",5000); //각 방마다 Product 의 주소값을 부여하고 생성자를 통해 멤버필드를 변환
        arr[1]=new Product("Computer",1_000_000);
        arr[2]=new Product("Apple",7_000);
        arr[3]=new Product("Dress",400_000);


        //Q2)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int price=arr[i].getPrice();
            String name=arr[i].getName();
            sum=sum+price;
            System.out.println(price);
            System.out.println(name);
            System.out.println(sum);
        }


        //밑의 해결 방법 이해하고 넘어가기
        int sum1=0;
        for(Product item:arr){
            sum+=item.getPrice();
            System.out.println(item);//arr
        }


        //Q3) 배열에서 제품명이 Apple 인것만 찾아서 콘솔에 출력
        //1번 방법
        for(int k=0;k< arr.length;k++){
            if(arr[k].getName().equals("Apple")){
                System.out.println(arr[k].getName());
            }
        }

        //2번 방법
        for(Product item: arr){
            if(item.getName().equals("Apple")){
                System.out.println(item.getName());
            }
        }






        //미니미션 아래 포맷처럼 출력되도록 해주세요
//        System.out.println(arr[0]); 제품명: Coffee, 가격: 5000원
//        System.out.println(arr[1]);

        /*
        Q2)
        enhance-for문을 사용하여 제품명,가격을 콘솔에 출력하고
        모든 제품의 가격을 더한값을 출력해주세요
         */



    }
}
class Product{
    private String name;
    private int price;



    // 생성자가 들어있는 클래스가 public 이 아니면 굳이 생성자 앞에 public 붙일 필요가 없다
    Product(String name,int price){
        this.name=name;
        this.price=price;
    }


    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }


    public String toString(){ // toString 은 파라미터가 없다. 그리고 toString 은 쓸려면 무조건 public 을 써줘야함.
        /*
        toString() 메서드는 매개변수를 받지 않습니다.
        이 메서드는 객체의 문자열 표현을 반환하는 역할을 하며, 호출 시 객체의 상태나 내용을 나타내는 문자열을 만들어야 합니다.
         */
        //return "제품명:"+name+", 가격:"+price; 이렇게 써도 되고 밑에 처럼 써도 된다.
        return String.format("제품명:%s, 가격:%,d원",name,price);//String.format 은 printf 와 같은 용도로 사용할 수 있다.
    }


}