public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //task 3
        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
