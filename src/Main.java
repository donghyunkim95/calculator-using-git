import java.util.Scanner;

// git "stage 상태" 에 저장된다.
// rollback : "unstage 상태" 로 뺀다. -> add 하면 다시 됨. 활성화된건 녹색글씨로 표기

// 터미널에서 git commit -m " " 써서 해도 되고,
// 상단 tap에서 git- commit 해도 된다.
public class Main {
    public static void main(String[] args) {
        // 5가지 연산 메뉴
        // 1 ~ 5 선택
        // 해당 연산을 실행

        // 사용자 입력! (Scanner sc)
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("================="); //구분자
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 나머지");
            System.out.println("q. 종료");
            System.out.println("================="); //구분자

            System.out.print("연산자 >> ");
            String op = sc.nextLine(); // 사용자의 입력을 기다린다. // op = operate
            System.out.print("피연산자 1 >>");
//          String a = sc.nextLine();
            int a = Integer.parseInt(sc.nextLine());  //String -> int 변환 :Inter~.pars
            System.out.print("피연산자 2 >>");
//          String b = sc.nextLine();
            int b = Integer.parseInt(sc.nextLine());

            //Switch로 해보자

            switch (op) {  // p.118
                case "1":
                    plus(a, b);  // 매개값으로 a, b 주자
                                  // 빨간밑줄이 생긴 이유는 아래 선언문에 매개변수가 없어서!
                    break;
                case "2":
                    minus(a, b);
                    break;
                case "3":
                    multiply(a, b);
                    break;
                case "4":
                    divide(a, b);
                    break;
                case "5":
                    modulo(a, b);
                    break;
                case "q":
                    return;  // 나가려면 exit 가 아니라 return 한다.
                                // return 하면 main 메서드를 종료한다는 의미가된다.
            }
        }
    }

    private static void plus(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));        // 매개변수가 비어있으니, 매개변수 int a int b 를 채워준다.
    }                                                               // 지역변수기 때문에 int x int y 해도 상관 없다.
                                                                    // = 호출부에 빨간 밑줄 안 생긴다.
    private static void minus(int a, int b) {
        System.out.println(a + "-" + b + " = " + (a - b));
    }
    private static void multiply(int a, int b) {
    }
    private static void divide(int a, int b) {
    }
    private static void modulo(int a, int b) {
        System.out.println(a + "%" + b + " = " + (a % b));
    }
}
