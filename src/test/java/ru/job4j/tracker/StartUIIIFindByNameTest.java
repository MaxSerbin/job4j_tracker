package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUIIIFindByNameTest {

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "AAA", "1"});
        Tracker tracker = Tracker.getTracker();
        Itemm itemm = tracker.add(new Itemm("AAA"));
        UserAction[] actions = {new FindByNameAction(out), new ExitAction()};
        new StartUIII(out).init(in, tracker, Arrays.asList(actions));
        assertThat(out.toString(), is("Menu:" + System.lineSeparator()
                + "0. === Find itemms by name ==="
                + System.lineSeparator() + "1. === EXIT ===" + System.lineSeparator()
                + "=== Find by name ===" + System.lineSeparator() + itemm
                + System.lineSeparator() + "Menu:" + System.lineSeparator()
                + "0. === Find itemms by name ===" + System.lineSeparator() + "1. === EXIT ==="
                + System.lineSeparator()));
    }
}