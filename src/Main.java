public class Main {
    public static void main(String[] args) {


        //Lesson 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц Осень");
                break;
            default:
                System.out.println("Неправильный месяц " + monthNumber);
        }
    }
}
