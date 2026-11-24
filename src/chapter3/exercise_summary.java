package chapter3;
import java.util.Scanner;
public class exercise_summary {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        IO.println("Enter the first weight:");
        int weight1 = scanner.nextInt();
        IO.println("Enter the second weight:");
        int weight2 = scanner.nextInt();

        float average = (weight1+weight2)/2.0f;
        IO.println("the result of average is : %f".formatted(average));

        float percent = 0.05f;

        IO.println("total amount that needed for the dino1 is : %f".formatted(weight1*percent));
        IO.println("total amount that needed for the dino2 is : %f".formatted(weight2*percent));

        IO.println("Enter the year:");
        int year = scanner.nextInt();

        if(year % 4 == 0 || year %400 ==0 || year%100 == 0){
            IO.println("It is a leap year!");
        }
        else{
            IO.println("It is not a leap year!");
        }
        
        int visitors = 123;
        int max_visitors = 100;
        if(visitors>max_visitors){
            IO.println("Sorry!,we have reached over the maxiumum visitors!");
        }
        else{
            System.exit(1);
        }
        IO.println("Age 1:");
        int age1 = scanner.nextInt();
        IO.println("Age 2:");
        int age2 = scanner.nextInt();
        int age_diff = age1 - age2;
        IO.println("the age diff of dinos:%d".formatted(age_diff));
    }
}
