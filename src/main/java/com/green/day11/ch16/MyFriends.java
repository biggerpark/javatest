package com.green.day11.ch16;

public class MyFriends {
    public static void main(String[] args) {

    }
}



//private 멤버필드 값 넣는 방법 2가지
//생성자, setter 메소드
//아래의 두 클래스는 중복된 내용이 있따. 그리고 둘 다 사람의 정보를 저장한다.
//그래서 중복된 정보를 상속으로 처리하면 코드가 줄어든다.

class UnivFriend{ //대학친구
    private String name;
    private String major;
    private String phone;

    UnivFriend(String name,String major, String phone){
        this.name=name;
        this.major=major;
        this.phone=phone;
    }

    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public String getPhone(){
        return phone;
    }
}



class CompFriend extends UnivFriend{ //직장동료
    private String department;

    CompFriend(String name,String major,String phone,String department){
        super(name,major,phone);
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }

}

