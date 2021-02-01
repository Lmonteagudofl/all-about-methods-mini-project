import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How old are you");
    int age = scan.nextInt();
    // asking the user their age
    System.out.println("what is the current year");
    int year = scan.nextInt();
    // asking the user the current year
    System.out.println("What school are you graduating from?");
    String school = scan.next();

    System.out.println("You will graduate in " + gradYear(age, year));
    // prints out the year you will graduate
  }

  static int gradYear(int currentAge, int currentYear) {
    int yearsLeft = 18 - currentAge;
    return yearsLeft + currentYear;
  }

  static String school(String name) {
    return "hello" + name;
  }
}
