package step4.correctnumber;

import java.util.Random;
import java.util.Scanner;

public class CorrectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100)+1;
        while (true){
            System.out.println("숫자를 입력해주세요 : ");
            int number = scanner.nextInt();
            if (answer > number){
                System.out.println("Up");
            } else if (answer < number) {
                System.out.println("Down");
            } else {
                break;
            }
        }
        System.out.println("정답");
    }
}
