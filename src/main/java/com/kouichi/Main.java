package com.kouichi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.printf("おはようございます！");
        System.out.printf("こんにちは");
        System.out.printf("おやすみ");
        System.out.printf("こんばんは");
        System.out.printf("おやすみ");
        System.out.printf("ただいまです～");
        List<String> stringList =new ArrayList<>();
        stringList.add("紅シイタケ");
        stringList.add("野菜");
        stringList.add("コンビニ弁当");
        stringList.stream().forEach(s -> System.out.printf(stringList.get(0)+"出力"));
    }
}