package seminar_2;

public class Task3 {
    public static void main(String[] args) {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(34, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }

    }
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }


}
