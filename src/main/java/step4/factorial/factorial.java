package step4.factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 1;
        for(int i = 1; i <= number; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}
