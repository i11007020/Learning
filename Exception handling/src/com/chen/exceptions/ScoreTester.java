package com.chen.exceptions;

import java.util.Scanner;

public class ScoreTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("請輸入數學成績: ");
            Score math = new Score(scanner.nextLine());
            System.out.print("請輸入英文成績: ");
            Score english = new Score(scanner.nextLine());
        } catch (ScoreFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
