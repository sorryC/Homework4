public class Main {
    public static void main(String[] args) {


        //Lesson 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance >= 20) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60) {
            deliveryDays++;
        }
        System.out.println(" Потребуется дней " + deliveryDays);
        }
    }
