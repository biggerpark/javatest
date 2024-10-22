package com.green.day11.ch16;

public class MyFriend2 {
    //❗❗다형성의 겉핡기❗❗

    public static void main(String[] args) {
        UnivFriend2[] arr=new UnivFriend2[3];
        CompFriend2[] arr2=new CompFriend2[3];


        //1) 다형성: 다양한 형태가 될 수 있는 성질>>변수타입은 다른데 저장할 수 있다.

        UnivFriend2 obj1=new UnivFriend2("LEE","Computer","010-111-1111");

        //2) 다형성을 응용하면 뭐가 가능하냐면
        Friend f1=obj1; //3) obj1 의 객체 주소값은 UnivFriend 객체의 주소값만 담을 수 있다.
        //4) 근데 상속관계면 부모의 객체의 주소값에도 담을 수 있다.

        Friend f2=new UnivFriend2("Seo","Eelectronics","010-222-2222");

        //5) Friend f2 가 의미하는 바는 Friend 객체 주소값을 담을 수 있는 f2 레퍼런스 변수
        //6) ❗❗❗이제는 Friend 를 상속받은 객체의 주소값도 담을 수 있다. 이게 다형성이다.❗❗❗


        //6)-1 부모 객체의 주소값을 담을 수 있는 배열을 만들어보자
        Friend[] arr3=new Friend[10];
        // 7) Friend,UnivFriend2 ,CompFriend2 객체 주소값 모두 다 담을 수 있는 주소값 배열

        arr3[0]=obj1;
        arr3[1]=f2;
        arr3[2]=new CompFriend2("yoon","r&d 1","02-123-9999");//8)이렇게 자식 주소값을 부모 주소값 배열에 담을 수 있다.
        arr3[3]=new CompFriend2("park","r&d 2","02-333-5555");


        arr3[2].showInfo();
        arr3[0].showInfo();

        //9) arr3[4].showInfo(); arr3[4]는 들어가있는 주소값이 없으므로 레퍼런스 변수의 기본타입인 null 이 뜰것이다.


        //Q) 반복문으로 arr3에 객체주소값이 있는 친구들만 showInfo() 메소드 호출
        //Q1) 이름,전화번호 + 대학친구는 전공도 출력, 직장동료는 부서 출력
        //A1)
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]==null){
                continue; // continue 와 break 구분 공부하기
            }
            arr3[i].showInfo();
            System.out.println();
        }

    }
}



class Friend{
    protected String name;
    protected String phone;

    Friend(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public void showInfo(){
        System.out.println("이름:"+name);
        System.out.println("전화:"+phone);
    }
}


//이름,전화,전공값을 초기화 할 수 있는 생성자 작성
class UnivFriend2 extends Friend{
    private String major;

    UnivFriend2(String name, String phone, String major){
        super(name,phone);
        this.major =major;
    }

    public String getMajor(){
        return major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("전공:"+major);
    }
}

class CompFriend2 extends Friend{
    private String department;

    CompFriend2(String name,String phone, String department){
        super(name,phone);
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("부서:"+department);
    }
}

