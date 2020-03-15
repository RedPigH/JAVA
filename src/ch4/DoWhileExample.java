package ch4;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("종료시 q 입력");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do{
            System.out.println(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while( ! inputString.equals("q"));

        System.out.println("프로그램 종료");
    }
}
