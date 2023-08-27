package seminar_2;

public class Task2 {
    public static void main(String[] args) {

        task_2();

    }

    private static void task_2() {
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double catchedRes1 = intArray[10] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Нет такого индекса в массиве" + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

