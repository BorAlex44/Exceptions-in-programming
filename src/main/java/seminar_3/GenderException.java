package seminar_3;

public class GenderException extends Exception{

    public GenderException(){
    }
    public void genderException(String elem) {
        System.out.println("Exception: GenderNotCorrect");
        System.out.println("Неверно указ пол пользователя!!!!");
    }
}
