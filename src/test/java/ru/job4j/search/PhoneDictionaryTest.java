package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void find() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(new Person("Max", "Serbin", "111333", "Moscow"));
        ArrayList<Person> persons = phones.find("Max");
        assertThat(persons.get(0).getSurname(), is("Serbin"));
    }

}