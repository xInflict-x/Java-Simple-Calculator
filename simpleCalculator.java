import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("1)Calculator\n2)Exit");
    Scanner menuInput = new Scanner(System.in);
    String userChoice = menuInput.nextLine();
    if (userChoice.contentEquals("1")) {
        calculator();
    }
    if (userChoice.contentEquals("2")) {
        System.exit(0);
    }
  }

  static void calculator() {
      Scanner calculatorInput = new Scanner(System.in);
      int firstNumber = calculatorInput.nextInt();
      int secondNumber = calculatorInput.nextInt();
      String operation = calculatorInput.next();
      if (operation.contentEquals("a")) {
          System.out.println(firstNumber + secondNumber);
      }
      if (operation.contentEquals("s")) {
          System.out.println(firstNumber - secondNumber);
      }
      if (operation.contentEquals("d")) {
          System.out.println(firstNumber / secondNumber);
      }
      if (operation.contentEquals("m")) {
          System.out.println(firstNumber * secondNumber);
      }
  }
}
