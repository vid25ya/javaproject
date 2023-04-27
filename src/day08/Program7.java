package day08;

import java.util.Scanner;

public class  Program7 {
  private Scanner scanner;

  public Program7() {
    scanner = new Scanner(System.in);
  }

  public void myMethod() {
    System.out.println(": ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
