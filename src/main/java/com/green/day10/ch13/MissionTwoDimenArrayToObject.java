package com.green.day10.ch13;

public class MissionTwoDimenArrayToObject {

    //객체지향적으로 해결하는것.
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        arr[0] = new Student("영수", 100, 90, 80);
        arr[1] = new Student("상철", 90, 90, 80);
        arr[2] = new Student("광수", 80, 70, 60);

        Student youngSu = arr[0];

        System.out.println(youngSu.getKorScore() + youngSu.getEngScore() + youngSu.getMathScore());
        System.out.println(youngSu.totalScore());
        System.out.println("-------------");
        for (Student stu : arr) {
            System.out.printf("%s-국어:%d, 영어:%d, 수학:%d\n", stu.getName(), stu.getKorScore(), stu.getEngScore(), stu.getMathScore());
        }

        System.out.println("----------------");

        for (Student stu : arr) { // ❗❗이거 진짜 자주 쓰네?❗❗
            System.out.println(stu);
        }

        printStudentsInfo(arr);
        printKorScores(arr);
        printEngScores(arr);
        printMathScores(arr);
        printAllScores(arr);

    }


    //위의 3가지 메소드 호출을 통해서 결과를 출력할 수 있는 메소드를 정의해보자.
    public static void printStudentsInfo(Student[] students) {
        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    public static void printKorScores(Student[] students) {
        int sumKor=0;
        for (Student stu : students) {
            sumKor+=stu.getKorScore();
        }
        System.out.printf("국어-합계점수: %d, 평균점수: %d\n",sumKor,sumKor/students.length);
    }

    public static void printEngScores(Student[] students) {
        int sumEng=0;
        for (Student stu : students) {
            sumEng+=stu.getEngScore();
        }
        System.out.printf("영어-합계점수: %d, 평균점수: %d\n",sumEng,sumEng/students.length);
    }

    public static void printMathScores(Student[] students) {
        int sumMath=0;
        for (Student stu : students) {
            sumMath+=stu.getMathScore();
        }
        System.out.printf("수학-합계점수: %d, 평균점수: %d\n",sumMath,sumMath/students.length);
    }

    public static void printAllScores(Student[] students){
        int sumAll=0;
        for(Student stu:students){
            sumAll+=stu.totalScore();
        }
        System.out.printf("학급-합계점수: %d, 평균점수: %f", sumAll,(float)sumAll/((students.length)*3.0));
    }
}

class Student {
    public static final int SUBJECT_CNT=3; // 메인메소드 값에서 변하지 않는 값을 상수로 설정
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;


    public String getName() {
        return name;
    }

    public int getKorScore() {
        return korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public int totalScore(){
        return korScore+engScore+mathScore;
    }

    @Override
    public String toString(){
        int allScore= totalScore();
        return String.format("%s-국어:%d, 영어:%d, 수학:%d | 합계점수:%d, 평균점수: %.1f\n",name,korScore,engScore,mathScore, totalScore(),(float) totalScore()/SUBJECT_CNT);
    }
}


