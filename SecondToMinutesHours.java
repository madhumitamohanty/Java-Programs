import java.util.Scanner;
public class SecondToMinutesHours{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter total seconds:");
int totalSeconds=sc.nextInt();
int Hours=totalSeconds/3600;
int remainingSeconds=totalSeconds%3600;
int Minutes=remainingSeconds/60;
int Seconds=remainingSeconds%60;
System.out.println(Hours+"Hours"+Minutes+"Minutes"+Seconds+"Seconds");
sc.close();
}
}
