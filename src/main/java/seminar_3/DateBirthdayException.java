package seminar_3;

public class DateBirthdayException extends Exception{
    public DateBirthdayException() {

    }
    public void dateBirthdayException(String elem) {
        System.out.println("Exception: DateBirthdayNotCorrectFormat");
        System.out.printf("Не правильный формат даты рождения: %s", elem);
        System.out.println();
    }
}
