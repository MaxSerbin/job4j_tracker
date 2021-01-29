package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StartUIIIConsoleTest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction()};
        new StartUIII(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() + "0. === EXIT ===" + System.lineSeparator()));
    }

    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ShowAllAction(out), new ExitAction()};
        new StartUIII(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() + "0. === Show all Itemm ===" +
                System.lineSeparator() + "1. === EXIT ===" + System.lineSeparator() +
                "=== Show All ===" + System.lineSeparator() + "Menu:" + System.lineSeparator() +
                "0. === Show all Itemm ===" + System.lineSeparator() + "1. === EXIT ===" +
                System.lineSeparator()));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new FindByIdAction(out), new ExitAction()};
        new StartUIII(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() + "0. === Find itemm by Id ===" +
                System.lineSeparator() + "1. === EXIT ===" + System.lineSeparator() +
                "=== Find by Id ===" + System.lineSeparator() + "Заявка с таким id не найдена." +
                System.lineSeparator() + "Menu:" + System.lineSeparator() +
                "0. === Find itemm by Id ===" + System.lineSeparator() + "1. === EXIT ===" +
                System.lineSeparator()));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "AAA", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new FindByNameAction(out), new ExitAction()};
        new StartUIII(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() + "0. === Find itemms by name ===" +
                System.lineSeparator() + "1. === EXIT ===" + System.lineSeparator() +
                "=== Find by name ===" + System.lineSeparator() + "Заявки с таким именем не найдены." +
                System.lineSeparator() + "Menu:" + System.lineSeparator() +
                "0. === Find itemms by name ===" + System.lineSeparator() + "1. === EXIT ===" +
                System.lineSeparator()));
    }
}