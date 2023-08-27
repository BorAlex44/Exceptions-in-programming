package seminar_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
         enterFractionalNumber();

    }

    public static void enterFractionalNumber(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Введите любое число: ");
                String number = scanner.nextLine();
                float float_num = Float.parseFloat(number);
                System.out.println("Введенное число - " + float_num);
                break;
            } catch (NumberFormatException e){
                System.out.println("Введено не число!!!! Повторите ввод!!!");
            }
        }
    }
}
