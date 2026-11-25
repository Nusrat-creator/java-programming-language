package chapter6;
import java.util.Scanner;
import java.util.Arrays;
public class exercise_summary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Tyrannosaurus", "Triceratops", "Velociraptor", "Stegosaurus", "Brachiosaurus", "Spinosaurus", "Ankylosaurus"};


        float[] weights = {14.72f, 3.85f, 0.41f, 98.16f, 27.09f, 6.54f, 81.33f, 42.9f, 19.68f, 0.77f};
        Arrays.sort(weights);
        System.out.println("Our heaviest dino is %.2f kg".formatted(weights[weights.length-1]));
        System.out.println("The children's favorite or in other word the smallest dino is %.2f kg".formatted(weights[0]));


        String[] park_names = {"Marcus Vance","Elena Rostova","Devon Brooks","Sora Takahashi"};
        String[] job_roles ={"Feeder","Tour guider","Security","Cleaner"};
        int length = park_names.length;
        for(int i = 0;i<length;i++){
            System.out.println(park_names[i] + " - " + job_roles[i] );


        }

        System.out.println("Please enter the size of the array:");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] ages = new int[size];
        int sum = 0;
        for (int j = 0;j<size;j++){
            ages[j]= scanner.nextInt();
            sum+=ages[j];
        }
        System.out.println("The average of all dinos are %.2f".formatted((float)sum/size));

        int[][] bus = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11}};
        for(int k = 0;k<bus.length;k++){
            for (int m = 0; m<bus[k].length;m++){
                System.out.print(bus[k][m]  +  " ");
            }
        System.out.println();
        }
    }
}
