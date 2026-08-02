import java.util.Scanner;

class TooYoungException extends RuntimeException
{
   TooYoungException(String msg)
   {
      super(msg);
   }
}

class TooOldException extends RuntimeException
{
   TooOldException(String msg)
   {
      super(msg);
   }
}

public class CustomizedException
{
   public static void main(String a[])
   {
      int age;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your Age:");
      age = sc.nextInt();

      if(age < 18)
      {
         throw new TooYoungException("You are Too Young.");
      }
      else if(age > 60)
      {
         throw new TooOldException("You are Too Old.");
      }
      else
      {
         System.out.println("You can vote");
      }
   }
}
