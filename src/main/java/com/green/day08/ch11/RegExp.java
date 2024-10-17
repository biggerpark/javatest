package com.green.day08.ch11;

import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        //구글에서 자바 이메일 정규표현식 찾고 공부
            String email = "abc12@naver.com";
            String regExp = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";

            boolean isOk = Pattern.matches(regExp, email);
            System.out.println(isOk);

            String REGEXP_KR = "^[가-힣]*$";
            isOk = Pattern.matches(REGEXP_KR, "안녕");
            System.out.println(isOk);
    }
}
