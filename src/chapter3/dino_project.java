package chapter3;
import java.util.Scanner;
public class dino_project {
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the dino:");
        int weight = scanner.nextInt();

        float percent = 0.05f;
        int number_of_times_that_dino_eats = 2;

        float daily_eaten_food = weight * percent;
        float meal_per_feeding = daily_eaten_food/2.0f;
        System.out.println("Our %d kg dino daily eats %.0f kg and per feeding is %.0f kg".formatted(weight,daily_eaten_food,meal_per_feeding));
    }
}
