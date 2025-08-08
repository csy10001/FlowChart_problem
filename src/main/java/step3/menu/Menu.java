package step3.menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요(1~5) : ");
        int number = scanner.nextInt();
        switch (number) {
            case 1 :
                System.out.println("아메리카노 4,000원");
                break;
            case 2 :
                System.out.println("카페라떼 4,500원");
                break;
            case 3 :
                System.out.println("카푸치노 4,500원");
                break;
            case 4 :
                System.out.println("녹차 4,000원");
                break;
            case 5 :
                System.out.println("핫초코 5,000원");
                break;
            default:
                System.out.println("숫자를 잘못 입력하셨습니다.");
        }
    }
}
