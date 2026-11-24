package chapter4;

import java.util.Scanner;
public class exercie_summary {
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean carnivore = true;
        boolean herbivore = false;

        if(carnivore){
            System.out.println("The dino is carnivore!\n");
        }
        else {
            System.out.println("The dino is herbivore!");
        }

        System.out.println("Please enter the species: ");
        String species = scanner.nextLine().trim();

        switch (species){
            case "Tyrannosaurus rex":
                System.out.println("Tyrannosaurus rex\n");
                break;
            case "Triceratops horridus":
                System.out.println("Triceratops horridus\n");
                break;
            case "Velociraptor mongoliensis":
                System.out.println("Velociraptor mongoliensis\n");
                break;
            case "Brachiosaurus altithorax":
                System.out.println("Brachiosaurus altithorax\n");
                break;
            case "Stegosaurus stenops":
                System.out.println("Stegosaurus stenops\n");
                break;
            default:
                System.exit(1);
                break;
        }


        System.out.println("Please enter the number of years:");
        int number_of_years_as_experience = scanner.nextInt();
        scanner.nextLine();
        if(number_of_years_as_experience>= 10){
            System.out.println("Your experience is enough to work with T-rex!");
        }
        else {
            System.out.println("You can't work with T-rex! Because you dont't have the enough experience");
        }

        System.out.println("enter the rating of the park:");
        int rating = scanner.nextInt();
        scanner.nextLine();
        int certain_threshold = 9;
        if(rating < certain_threshold){
            System.out.println("The park must be improve! For the sake of visitors!");
        }
        else{
            System.out.println("The park is good to go!");
        }

        System.out.println("Please enter the size of the dino:");
        String size = scanner.nextLine().strip();

        switch (size){
            case "XS":
                System.out.println("You need extra small enclosure.");
                break;
            case "S":
                System.out.println("You need small enclosure.");
                break;
            case "M":
                System.out.println("You need medium enclosure.");
                break;
            case "L":
                System.out.println("You need large enclosure.");
                break;
            case "XL":
                System.out.println("You need extra large enclosure.");
                break;
        }


        System.out.println("Please enter your time(on the clock) to enter the park:");
        int time_int = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Is it P.M. or A.M?");
        String time_str = scanner.nextLine();

        if(time_str.equals("A.M")){
            if(time_int >= 10 && time_int<=12){
                System.out.println("You may come to the park!");
            }
            else{
                System.out.println("Only at the office hours you may come to the park!");
            }
        }
        else if(time_str.equals("P.M.")){
            if(time_int>=1 && time_int<=7){
                System.out.println("You may come to the park!");
            }
            else{
                System.out.println("Only at the office hours you may come to the park!");
            }


        }
    }
}
