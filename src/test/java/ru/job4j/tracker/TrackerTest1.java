package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerTest1 {

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Itemm bug = new Itemm();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Itemm bugWithDesc = new Itemm();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}