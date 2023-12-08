import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int circle = 0;
        System.out.println("Введите колличество чисел: ");
        count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9 - 0 + 1) + 0;
            System.out.print(numbers[i]);
            if( numbers[i] == 6  ){
                circle = circle + 1;
            } if(numbers[i] == 8){
                circle = circle + 2;
            } if(numbers[i] == 9){
                circle = circle + 1;
            } if(numbers[i] == 0){
                circle = circle + 1;
            }
        }
        System.out.println(" ");
        System.out.println(circle);
    }
}