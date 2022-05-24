package com.metadevs;

import java.util.ArrayList;

public class Company implements IdealCompany {
    private String name;
    private ArrayList <Person> persons;

    public Company(String рога_и_копыта) {
    }



    public String getName() {
        return name;
    }

    public void Company(String name) {
        this.name = name;
        persons = new ArrayList<Person>();
    }
@Override
    public void addEmployee(Person person, int salary){
        persons.add(person);
        person.setSalary(salary);
        person.setCompanyName(name);
    }
@Override
    public void fireEmployee(String name){
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName() == name) {
                persons.remove(i);
            }
        }
    }
@Override
    public void checkSalaryAndAge(){
        for (int i = 0; i <persons.size(); i++) {
            persons.get(i).checkDifference();
        }
    }
@Override
    public void aboutCompany(){
        System.out.println(name);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
            persons.get(i).aboutPerson();
        }
    }

}