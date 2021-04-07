package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class StartUIIIValidateTest {

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "0" }
        );
        Tracker tracker = Tracker.getTracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUIII(out).init(in, tracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                String.format(
                        "Menu:%n"
                                + "0. === EXIT ===%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu:%n"
                                + "0. === EXIT ===%n"
                )
        ));
    }
}