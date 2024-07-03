import java.util.Scanner;

public class SentinelaValueDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a int value (the program exits if the input is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while(data != 0){
            sum += data;
            System.out.println("Enter an int value(the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
