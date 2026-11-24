package dino.about.the;

import java.util.Scanner;
public class ex3_chapter2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number_of_visitors_yearly = 1235125;
        System.out.println("There’s a maximum of %d people allowed in Mesozoic Eden.".formatted(number_of_visitors_yearly));


        System.out.println("Please enter the breed:");
        String breed = scanner.nextLine().trim();

        System.out.println("PLease enter the height:");
        float height = scanner.nextFloat();

        System.out.println("PLease enter the length:");
        float length = scanner.nextFloat();

        System.out.println("PLease enter the weight:");
        float weight = scanner.nextFloat();

        System.out.println("PLease enter the age:");
        int age = scanner.nextInt();

        System.out.println("PLease enter the name:");
        String name = scanner.nextLine().trim();

        System.out.println("PLease enter the whether it is omnivours or not:");
        String answer = scanner.nextLine().trim();

        if(answer.equals("Yes")){
            System.out.println("the dino is omnivours");
        }
        else{
            System.out.println("It is not omnivours");
        }

        System.out.println("the breed: %s, the height:%f,the length:%f,the weight:%f,the name:%s,the age:%d ".formatted(breed,height,length,weight,name,age));
    }

}
