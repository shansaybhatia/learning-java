package fundamentals;

import java.util.Scanner;

public class StringsSubstrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String userName;
    String domain;
    String email;

    System.out.print("Enter your email: ");
    email = sc.nextLine();

    if (email.contains("@")) {
      userName = email.substring(0, email.indexOf("@"));
      domain = email.substring(email.indexOf("@") + 1);

      System.out.println(userName);
      System.out.println(domain);
    } else {
      System.out.println("Email must contain '@'");
    }

    sc.close();
  }
}
