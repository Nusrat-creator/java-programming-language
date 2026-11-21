import java.util.Scanner;

void main() {
  int answer = (int)(Math.random() * 100) + 1;
  int tries = 0;
  Scanner scanner = new Scanner(System.in);
  IO.println("Please enter your number:\n");
  while (true) {
    int num = scanner.nextInt();
    tries+=1;
    if (num < answer) {
      IO.println("your number is smaller than answer! Please enter a new num:\n");
    } else if (num > answer) {
      IO.println("your number is bigger than the answer! Please enter a num:\n");
    }
    else{
        IO.println("Congratulations! you found the answer: %d ,number of tries:%d".formatted(answer, tries));
        break;
      }
  }
}
