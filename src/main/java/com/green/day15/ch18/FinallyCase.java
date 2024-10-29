package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        /*만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없고
        writer.write("반갑다"); 이때 예외가 발생이 되었다면, writer.close(); 이 문장이 실행이 되지 않는다
        왜냐하면 밑의 catch (IOException e) 로 넘어가기 때문이다.
        그런데 writer.close(); 이 무조건 실행이 되어야 한다.

         */

        Path path = Paths.get("D:/Simple.txt");

        try {
            BufferedWriter writer = Files.newBufferedWriter(path);

            writer.write('A');
            writer.write("반갑다");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class FinallyCase2{
    public static void main(String[] args) {

        BufferedWriter writer=null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write('A');
            writer.write("반갑다");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            writer.close(); // writer.close()를 밖으로 빼고 무조건 실행되게 만든다.
        }catch (IOException e){

        }
        System.out.println("----끝----");
    }
}

class FinallyCase3 {
    public static void main(String[] args) {

        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write('A');
            writer.write("반갑다");
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // finally 는 예외가 발생해도 안해도 무조건 실행되는 부분
            //finally 가 붙으면 메소드에서 return 키워드를 만나도 return 키워드가 실행되고 finally 는 실행된다.
            try {
                if(writer !=null){
                    writer.close(); // writer.close()를 밖으로 빼고 무조건 실행되게 만든다.
                }
            } catch (IOException e) {

            }
        }
    }
}

