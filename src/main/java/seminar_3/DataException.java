package seminar_3;

public class DataException extends Exception{
    public DataException(){
    }
    public void dataException(String elem){
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Не корректные данные: %s", elem);
        System.out.println();
    }
}
