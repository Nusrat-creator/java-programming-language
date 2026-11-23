package dino.about.the;
import java.util.Scanner;
public class ex4_chapter2 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IO.println("Please enter the name :");
        String name = scanner.nextLine().trim();
        IO.println("please enter the age:");
        int age = scanner.nextInt();


        IO.println("the employee's name is %s and its age is %d".formatted(name,age));
    }
}
