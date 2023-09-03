package seminar_3;

import java.util.Scanner;

public class EntryData {
    public String[] inputData() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = scanner.nextLine();
            String[] arrData = data.split(" ");
            if (arrData.length == 6){
                return arrData;
            } else if (arrData.length < 6) {
                System.out.println("Вы ввели слишком мало данных!!!! Проверьте данные и попробуйте еще раз!!!");
            } else System.out.println("Вы ввели слишком много данных!!!! Проверьте данные и попробуйте еще раз!!!");
        }
    }
}
