package com.courseJava;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Pizza {

    public static String eatPizza(String answer) throws InterruptedException {

        String answerTrueEn = "Yes";
        String answerTrueRu = "Да";
        String answerFalseEn = "No";
        String answerFalseRu = "Нет";
        if (answer.equals(answerTrueEn) || answer.equals(answerTrueEn.toUpperCase()) || answer.equals(answerTrueEn.toLowerCase()) || answer.equals(answerTrueRu) || answer.equals(answerTrueRu.toUpperCase()) || answer.equals(answerTrueRu.toLowerCase())) {
            System.out.println("\nMaking pizza!" + "\n" +
                    "------------- \nWait 5 seconds...\n-------------");
            for(int i = 1; i < 6; i++){
                TimeUnit.SECONDS.sleep(1);
//                Thread.sleep(1000);
                System.out.println(i + " seconds");
            }
            return "------------- \npizza is ready!";
        }
        else if (answer.equals(answerFalseEn) || answer.equals(answerFalseEn.toUpperCase()) || answer.equals(answerFalseEn.toLowerCase()) || answer.equals(answerFalseRu) || answer.equals(answerFalseRu.toUpperCase()) || answer.equals(answerFalseRu.toLowerCase()))
            return "\nBye!";
        else
            return "------------- \nWarning! \n------------- \nIncorrectly entered date! \n-------------\nPlease try again!";
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("You want pizza?!");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        System.out.println(eatPizza(answer));
    }
}
