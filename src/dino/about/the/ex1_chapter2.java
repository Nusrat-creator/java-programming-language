import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Please enter the breed:");
    String breed = scanner.nextLine().trim();
    IO.println("PLease enter the height:");
    float height = scanner.nextFloat();
    IO.println("PLease enter the length:");
    float length = scanner.nextFloat();
    IO.println("PLease enter the weight:");
    float weight = scanner.nextFloat();

IO.println("the breed: %s, the height:%f,the length:%f,the weight:%f ".formatted(breed,height,length,weight));

}