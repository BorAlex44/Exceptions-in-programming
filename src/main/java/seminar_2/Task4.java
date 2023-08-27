package seminar_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        emptyString();
    }

    public static void emptyString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String string = scan.nextLine();
        if (!string.isEmpty()){
            System.out.println("Вы ввели: " + string);
        } else {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
    }
}

