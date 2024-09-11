package com.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0;
        String op = "";
        int answer = 0;
        String end = "";

        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요(ex. + - * /): ");
            op = sc.next();
            if(op.equals("+")){
                answer = a + b;
            }else if(op.equals("-")){
                answer = a - b;
            }else if(op.equals("+")){
                answer = a + b;
            }else if(op.equals("*")){
                answer = a * b;
            }else if(op.equals("/")) {
                if (b != 0) {
                    answer = a / b;
                    break;
                }else{
                    System.out.println("0으로 나눌 수 없음");
                    continue;
                }


                /* exit을 입력 받으면 반복 종료 */
            }
            System.out.println("결과: " + answer);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            end = sc.next();
            if(end.equals("exit")){
                break;
            }else{
                continue;
            }

        }


    }
}

