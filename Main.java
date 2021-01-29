import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("What is your name?");
    String name = scan.next();
   
   System.out.println("Is it raining?");
    Boolean rain = scan.nextBoolean();

   System.out.println(forecast(name));
  }
   static boolean weather(boolean rain) 
  {
    if(rain) 
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  static String forecast(String name) 
  {
    String forecast = "It is raining out side " + name;
    return forecast;
  }
  
}