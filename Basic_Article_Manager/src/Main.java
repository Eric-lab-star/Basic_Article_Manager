import java.util.Scanner;

public class Main {
  public static int counter = 0;
  public static void main(String[] args) {
    System.out.println("== 프로그램 시작 ==");
    String input;
    try (Scanner stdIn = new Scanner(System.in)) {
      do {
        System.out.print("명령어) ");
        input = stdIn.nextLine().trim();
        inputChecker(input, stdIn);
      } while (!input.equals("exit"));
    }
    System.out.println("== 프로그램 종료 ==");
    // hello
  }

  public static void inputChecker(String input, Scanner std) {
    switch (input) {
      case "article list":
        System.out.println("게시글이 없습니다");
        break;
      case "article write":
        Main.counter = Main.counter + 1;
        System.out.print("제목: ");
        String title = std.nextLine().trim();
        System.out.print("내용: ");
        String body = std.nextLine();
        System.out.println(counter + "번 글이 생성되었습니다.");
        System.out.println(title);
        System.out.println(body);
        break;
      case "exit":
        break;
      default:
        System.out.println("존재하지 않은 명령어 입니다");
        break;
    }
  }
}
