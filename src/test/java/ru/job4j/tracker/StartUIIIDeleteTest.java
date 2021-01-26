package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUIIIDeleteTest {

    @Test
    public void whenDeleteItemm() {
        Tracker tracker = new Tracker();
        Itemm itemm = new Itemm("new itemm");
        tracker.add(itemm);
        String[] answers = {String.valueOf(itemm.getId())};
        StartUIII.deleteItemm(new StubInput(answers), tracker);
        Itemm deleted = tracker.findById(itemm.getId());
        assertThat(deleted,is(nullValue()));
    }
}