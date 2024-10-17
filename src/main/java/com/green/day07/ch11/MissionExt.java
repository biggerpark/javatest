package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        String fileNm="nice_Very.Nice.jpg";


        String ext=fileNm.substring(fileNm.lastIndexOf(".")+1);



        System.out.println(ext); // jpg
    }
}
