import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Please enter your degree:");
    int temp =scanner.nextInt();
    scanner.nextLine();
    IO.println("Please enter a sign that you want to convert to(C or F):");
    String sign = scanner.nextLine().trim();
    if(java.util.Objects.equals(sign, "F") || java.util.Objects.equals(sign, "f")){
        double n_temp =(temp * 1.8)+32;
        IO.println(n_temp);
    }
    else if(java.util.Objects.equals(sign, "C") || java.util.Objects.equals(sign, "c")){
        double n_temp = (temp - 32) *(5.0/9.0);
        IO.println(n_temp);
    }
    else{
        System.exit(1);
    }
}