package chapter6;
import java.util.Scanner;
import java.util.Arrays;
public class project_chapter6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] dinoNames = new String[10];
        int[] dinoAges = new int[10];
        String[] dinoSpecies = new String[10];
        String[] dinoEnclosures = new String[10];

        for (int i = 0; i<10;i++){
            System.out.print("Please enter the Dino name:");
            dinoNames[i]= scanner.nextLine().strip();
            System.out.println();
            System.out.print("Please enter the Dino age:");
            dinoAges[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            System.out.print("Please enter the Dino's species:");
            dinoSpecies[i] = scanner.nextLine().strip();
            System.out.println();
            System.out.print("Please enter the Dino's enclosure:");
            dinoEnclosures[i] = scanner.nextLine().strip();
        }


        for(int j = 0;j<10;j++){
            System.out.println("The dino's name is %s.Its age is %d,it is from the %s,its enclosure is %s".formatted(dinoNames[j],dinoAges[j],dinoSpecies[j],dinoEnclosures[j]));
        }
    }
}
