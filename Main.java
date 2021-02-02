import java.util.Scanner; //scanner added 

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();// asking users name

    System.out.println("Is it raining? True/False");
    Boolean rain = scan.nextBoolean(); // asking user if it's raining

    System.out.println("To find the average rainfall for the day, type the amount of rain in inches for the morning.");
    int num1 = scan.nextInt();

    System.out.println("Type the amount of rainfall for the afternoon.");
    int num2 = scan.nextInt();

    System.out.println(weather(rain));
    System.out.println("The avergae amount of rainfall is " + avgRain(num1, num2) + " inches");
    System.out.println(day(name));// calling the methods

  }

  static String weather(boolean rain) // string/boolean method
  {
    if (rain) {//if else statement
      return "Get inside!";// prints if its raining
    } else {
      return "Continue on!";// prints if its not raining
    }
  }

  static int avgRain(int num1, int num2) //int method
  {
    int avgRain = (num1 + num2) / 2; //prints avgerage rainfall 
    return avgRain;
  }

  static String day(String name) // string method
  {
    return "Have a great day " + name + "!";// prints at the end
  }

}