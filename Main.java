import java.util.Scanner; //scanner added 
class Main 
{
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("What is your name?");
    String name = scan.next();//asking users name
   
   System.out.println("Is it raining? True/False");
    Boolean rain = scan.nextBoolean(); //asking user if it's raining
   
   System.out.println(weather(rain));
   System.out.println(day(name));//calling the methods

  }
   static boolean weather(boolean rain) //boolean method
  {
    if(rain)  
    {
      System.out.println("Get inside!");//prints if its raining
      return true;
    }
    else
    {
      System.out.println("Continue on!");//prints if its not raining
      return false;
    }
  }

  static String day(String name) //string method
  {
    String forecast = "Have a great day " + name + "!";
    return forecast;//prints at the end
  }
  
}