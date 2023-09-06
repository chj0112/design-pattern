// 201810811 조현준
import java.util.Scanner;

// 입력된 문자 ch가 0~9까지의 숫자를 나타내는 문자인 경우, ch - '0'으로 0~9까지의 정수로 변환 가능
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);      // 키보드에서 한 글자 입력 받기
        while (ch != 'q' && ch != 'Q') {    // 종료 문자가 아니면 반복
            if (ch >= '0' && ch <= '9') {
                int digit = 0;
                if (ch == '0') digit = 0;
                else if (ch == '1') digit = 1;
                else if (ch == '2') digit = 2;
                else if (ch == '3') digit = 3;
                else if (ch == '4') digit = 4;
                else if (ch == '5') digit = 5;
                else if (ch == '6') digit = 6;
                else if (ch == '7') digit = 7;
                else if (ch == '8') digit = 8;
                else if (ch == '9') digit = 9;
                c.processDigit(digit);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                c.processArithmeticOperator(ch);
            } else if (ch == '=') {
                c.processEqualOperator();
                System.out.print(c.getOp1());
                System.out.print(" " + c.getOp() + " ");
                System.out.print(c.getOp2());
                System.out.print(" = ");
                System.out.println(c.getResult());
            }
            ch = sc.next().charAt(0);
        }
    }
}
