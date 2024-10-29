package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {

        Path path = Paths.get("D:/Simple.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path); Scanner scan=new Scanner(System.in)) { // 이렇게 적으면 writer.close() 가 자동으로 들어가서 닫힌다.
            /*
            위에서 try() 괄호 안에 선언과 초기화를 같이 할때
            writer.close(), scan.close() 등 무조건 실행된다.
            따로 try-catch 문을 사용하여 close() 할 필요가 없어진다
            AutoCloseable 인터페이스를 상속받은 객체만 쓸 수 있다.
             */
            writer.write('A');
            writer.write("반갑다");


            AutoCloseable auto=writer; //-> 에러가 안생기므로  AutoCloseable 을 상속받구나 라는 것을 알 수 있다.
            AutoCloseable auto1=scan;  //-> 에러가 안생기므로  AutoCloseable 을 상속받구나 라는 것을 알 수 있다.

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

