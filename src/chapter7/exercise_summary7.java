package chapter7;
import  java.util.Scanner;
import java.time.LocalTime;
public class exercise_summary7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printLifeStage(0);
        printLifeStage(3);
        printLifeStage(12);

        daily_weight_calculator(1000);
        int[] age = {1,2,3,4,5,6,7,8,9,10};
        dino_age_calc(age);
        LocalTime current_time = LocalTime.now();
        is_it_open(current_time);
    }

    public static void printLifeStage(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 1) {
            System.out.println("Hatchling");
        } else if (age <= 7) {
            System.out.println("Juvenile");
        } else {
            System.out.println("Adult");
        }
    }
    public static void daily_weight_calculator(int weight){
        System.out.println("Daily food of dino(in kg):%.2f".formatted(weight*0.05f));
    }
    public static void dino_age_calc(int[] ages){
        int sum = 0;
        for(int i = 0;i<ages.length;i++){
            sum+=ages[i];
        }
        System.out.println("The average ages of dinos: %.2f".formatted((float) sum/ages.length));
    }
    public static boolean is_it_open (LocalTime time){
        LocalTime start_time = LocalTime.of(9,0);
        LocalTime end_time = LocalTime.of(19,0);
        if(time.isAfter(start_time) || time.isBefore(end_time)){
            System.out.println("yes");
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
}

