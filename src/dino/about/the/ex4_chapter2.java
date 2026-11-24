package dino.about.the;
import java.util.Scanner;
public class ex4_chapter2 {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name :");
        String name = scanner.nextLine().trim();
        System.out.println("please enter the age:");
        int age = scanner.nextInt();


        System.out.println("the employee's name is %s and its age is %d".formatted(name,age));
    }
}
