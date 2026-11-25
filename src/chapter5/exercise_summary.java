package chapter5;
import java.util.Scanner;
public class exercise_summary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i<=100;i++){
            System.out.println("dino%d".formatted(i));
        }


        System.out.println("Have you fed them today?");
        String answer;
        do{
            System.out.println("Did you feed them?");
            answer = scanner.nextLine().strip();
        }
        while(!answer.equals("Yes"));

        int countdown = scanner.nextInt();
        scanner.nextLine();

        while(countdown > 0){
            System.out.println("The countdown %d".formatted(countdown));
            countdown--;
        }


        int sum = 0;
        System.out.println("enter the size:");
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1;i<=size;i++){
            System.out.println("enter the weight:");
            int weight = scanner.nextInt();
            scanner.nextLine();
            sum+=weight;
        }
        System.out.println("Total of sum:%d".formatted(sum));


        int total_tickets = scanner.nextInt();
        scanner.nextLine();
        while(total_tickets>0){
            total_tickets--;
            continue;
        }
        System.out.println("The tickets are sold out!");


        String report;
        do{
            System.out.println("Did you secure the park?");
            report = scanner.nextLine().strip();
        }
        while(!report.equals("Yes"));


    }
}
