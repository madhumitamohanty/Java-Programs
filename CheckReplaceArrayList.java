import java.util.ArrayList;
import java.util.Scanner;
public class CheckReplaceArrayList{
public static void main(String args[]){
ArrayList <Integer> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
list.add(10);
list.add(20);
list.add(30);
list.add(40);
System.out.println("ArrayList element: " + list);
System.out.println("Enter number to check: ");
int num=sc.nextInt();
if(list.contains(num)){
System.out.println("Enter new number to replace: ");
int newNum=sc.nextInt();
int index=list.indexOf(num);
list.set(index,newNum);
System.out.println("Element replaced;");
}
else{
list.add(num);
System.out.println("Element not found Added to ArrayList.");
}
System.out.println("update ArrayList:"+ list);
}
}