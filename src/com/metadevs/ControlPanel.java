package com.metadevs;

public class ControlPanel {
    public static void main(String[] args) {
        Company roga = new Company("Рога и Копыта");
        Person director = new Person("Игорь Алексеевич", 56);
        Person chiefAccountant = new Person("Елена Николаевна", 32);

        roga.addEmployee(director, 200);
        roga.addEmployee(chiefAccountant, 300);
        roga.fireEmployee(director.getName());
        roga.aboutCompany();
        roga.checkSalaryAndAge();
    }
}
