package com.green.day13.bbaekjjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoom {
    /*
    총 N개의 시험장이 있고, 각각의 시험장마다 응시자들이 있다. i번 시험장에 있는 응시자의 수는 Ai명이다.

    감독관은 총감독관과 부감독관으로 두 종류가 있다. 총감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 B명이고,
    부감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 C명이다.

    각각의 시험장에 총감독관은 오직 1명만 있어야 하고, 부감독관은 여러 명 있어도 된다.

    각 시험장마다 응시생들을 모두 감시해야 한다. 이때, 필요한 감독관 수의 최솟값을 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("방 갯수를 입력하세요");
        int classNumber=scan.nextInt();


        List<Integer> students=new ArrayList<>();

        System.out.println("각 방의 학생 수를 입력하세요");
        for(int i=0;i<classNumber;i++){
            int studentNumber=scan.nextInt();
            students.add(studentNumber);
        }



        System.out.println("총감독관이 맡을 수 있는 학생 수와 부감독관이 맡을 수 있는 학생수를 입력하세요");
        int studentsChong=scan.nextInt();
        int studentsBboo=scan.nextInt();


        int sumBboo=0;
        int sumChong=0;

        for(int stu:students){
            int bboo=stu-studentsChong;
            if(bboo>0){
                int n1=bboo/studentsBboo;
                if(bboo%studentsBboo!=0){
                    sumBboo++;
                }
                sumBboo+=n1;
            }
            sumChong++;
        }


        System.out.println("--------------------");
        System.out.println("필요한 감독관의 수 최솟값:"+(sumBboo+sumChong));
    }
}




