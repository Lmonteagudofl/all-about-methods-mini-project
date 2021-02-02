import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

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
    // asking what school the user is graduating from
    System.out.println("You will graduate in " + gradYear(age, year));
    // prints out the year you will graduate
    System.out.println("what is our GPA?");
    int gpa = scan.nextInt();
    // asking the user what their gpa is 
  }

  static int gradYear(int currentAge, int currentYear) {
    int yearsLeft = 18 - currentAge;
    return yearsLeft + currentYear;
  }

  static String school(String name) {
    return "hello" + name;
  }

  static boolean gpaQualification(double gpa, int credits) {

    if (gpa >= 2.0 && credits >= 30 ) {
      return true;
    } else {
      return false;
    }
  }
}
