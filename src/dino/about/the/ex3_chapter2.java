package dino.about.the;

import java.util.Scanner;
public class ex3_chapter2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number_of_visitors_yearly = 1235125;
        IO.println("There’s a maximum of %d people allowed in Mesozoic Eden.".formatted(number_of_visitors_yearly));


        IO.println("Please enter the breed:");
        String breed = scanner.nextLine().trim();

        IO.println("PLease enter the height:");
        float height = scanner.nextFloat();

        IO.println("PLease enter the length:");
        float length = scanner.nextFloat();

        IO.println("PLease enter the weight:");
        float weight = scanner.nextFloat();

        IO.println("PLease enter the age:");
        int age = scanner.nextInt();

        IO.println("PLease enter the name:");
        String name = scanner.nextLine().trim();

        IO.println("PLease enter the whether it is omnivours or not:");
        String answer = scanner.nextLine().trim();

        if(answer.equals("Yes")){
            IO.println("the dino is omnivours");
        }
        else{
            IO.println("It is not omnivours");
        }

        IO.println("the breed: %s, the height:%f,the length:%f,the weight:%f,the name:%s,the age:%d ".formatted(breed,height,length,weight,name,age));
    }

}
