package chapter4;

import java.util.Scanner;
public class project_chapter4 {
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your role:");
        String job_role = scanner.nextLine().strip();

        switch (job_role){
            case "feeding":
                System.out.println("First know your dino's weight:");
                float percent_for_feeding = 0.05f;
                int weight = scanner.nextInt();
                scanner.nextLine();
                float daily_feeding = weight * percent_for_feeding;
                float meal_per_feeding = daily_feeding/2.0f;
                System.out.println("The %d kg dino,eats %.2f kg meal per day and you must feed %.2f kg per meal!".formatted(weight,daily_feeding,meal_per_feeding));
                break;
            case "cleaning":
                System.out.println("Did you clean the park(Yes or No)");
                String answer = scanner.nextLine().strip();
                if(answer.equals("Yes")){
                    System.out.println("Congratulations! You can take a break!");
                }
                else if(answer.equals("No")){
                    System.out.println("Unfortunately,you can't take a break! because the park is dirty!");
                }
                else {
                    System.exit(1);
                }
                break;
            case "security":
                int the_recommended_security_score = 8;
                System.out.println("Please enter your today's report on the overall security of the park:");
                int report_answer = scanner.nextInt();
                scanner.nextLine();
                if(report_answer<the_recommended_security_score){
                    System.out.println("WARNING! You must immediately recheck the park for any danger!");
                }
                else{
                    System.out.println("Good job! The park is secure thanks to you!");
                }
                break;
            case "tour guiding":
                System.out.println("Please enter your time(on the clock) to enter the park:");
                int time_int = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Is it P.M. or A.M.?");
                String time_str = scanner.nextLine();

                if(time_str.equals("A.M.")){
                    if(time_int >= 10 && time_int<=12){
                        System.out.println("You may come to the park!");
                    }
                    else{
                        System.out.println("Only at the office hours you may come to the park!");
                    }
                }
                else if(time_str.equals("P.M.")) {
                    if (time_int >= 1 && time_int <= 7) {
                        System.out.println("You may come to the park!");
                    }
                    else{
                        System.out.println("Only at the office hours you may come to the park!");
                    }
                }
                else {
                    System.exit(1);
                }
            default:
                System.exit(1);
                break;

        }
    }
}
