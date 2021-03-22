package ru.job4j.search;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();


    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for(Person person : persons) {
            if(person.getName().contains(key)) {
                result.add(person);
            } else if (person.getSurname().contains(key)) {
                result.add(person);
            } else if (person.getPhone().contains(key)) {
                result.add(person);
            } else if (person.getAddress().contains(key)) {
                result.add(person);
            }
             for(Object a : result) {
                 System.out.println(a);
             }
        }
        return result;

    }
}
