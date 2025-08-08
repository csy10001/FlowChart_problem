package step3.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 넣어주세요");
        double num1 = scanner.nextDouble();
        System.out.println("두번째 숫자를 넣어주세요");
        double num2 = scanner.nextDouble();
        System.out.println("사칙연산을 입력해주세요");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("0으로 나눌수 없습니다.");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
        }
    }
}
