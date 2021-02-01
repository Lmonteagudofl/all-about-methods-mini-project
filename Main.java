import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How old are you");
    int age = scan.nextInt();
    // asking the user their age 
    System.out.println("what is the current year");
    int year = scan.nextInt();
    

    System.out.println(gradYear(age, year));
  }

  static int gradYear(int currentAge, int currentYear) {
    int yearsLeft = 18 - currentAge;
    return yearsLeft + currentYear;
  }
}