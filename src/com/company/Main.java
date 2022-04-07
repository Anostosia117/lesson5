package com.company;

public class Main {

    public static void main(String[] args) {

        // Задание 1

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int start = 10;
        while ( start >= 1) {
            System.out.print(start + " ");
            start --;
        }
        System.out.println();

        // Задание 2

        for (int friday = 3; friday <= 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3

        int lastCentury = 1822;
        int nextCentury = 2122;
        for (int comet = 0; comet <= nextCentury; comet +=79){
            if (comet >= lastCentury && comet <= nextCentury) {
                System.out.println(comet);
            }
        }
    }
}



