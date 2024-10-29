package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.*;

//p.402 예제
/*
1) D드라이브에 Simple.txt 파일을 만든다.
 */


public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void md1() throws IOException { //3)-1나도 똑같이 예외를 throws 하면 괜찮아짐
        md2();
    }

    public static void md2() throws IOException {
        Path path = Paths.get("D:/Simple.txt"); //절대경로(full 경로) \\ 상대경로는 어떤 위치기준에서 폴더를 올라간다, 내려간다 의 개념
        //2) get 메소드 안에 있는 파일을 찾아서 path 주소값에 저장한다.
        BufferedWriter writer = Files.newBufferedWriter(path); // 4) newBufferedWriter 메소드는 IOException 이라는 예외를 throws 를 하고 있다는 것을 알 수 있어야한다.

        writer.write('A');
        writer.write("반갑다");
        writer.close(); // 3) 리소스를 많이 잡아먹기 때문에 객체를 닫아줘야한다.


    }

}
