package lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Никитин Александр Максимович", "Директор департамента", "boss@mai.ru", "001", 500000, 45);
        employees[1] = new Employee("Никитин Николай Максимович", "Заместитель директора департамента", "zam@mai.ru", "002", 200000, 41);
        employees[2] = new Employee("Николаев Федор Константинович", "Начальник отдела", "nach@mai.ru", "003", 100000, 30);
        employees[3] = new Employee("Никитина Маргарита Сергеевна", "Руководитель направления", "ruk@mai.ru", "004", 50000, 27);
        employees[4] = new Employee("Михайлов Андрей Анатольевич", "Специалист", "spec@mai.ru", "005", 20000, 20);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }
    }
    
    }
