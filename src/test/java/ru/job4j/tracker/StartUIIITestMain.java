package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

/*public class StartUIIITestMain {

    @Test
    public void whenCreateItemm() {
        Input in = new StubInput(new String[] {"0", "Itemm name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ExitAction()};
        new StartUIII().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Itemm name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Itemm itemm = tracker.add(new Itemm("Replaced itemm"));
        String replacedName = "New itemm name";
        Input in = new StubInput(new String[] {"0",
        String.valueOf(itemm.getId()), "New itemm name", "1"});
        UserAction[] actions = {new ReplaceAction(), new ExitAction()};
        new StartUIII().init(in, tracker, actions);
        assertThat(tracker.findById(itemm.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Itemm itemm = tracker.add(new Itemm("Deleted itemm"));
        Input in = new StubInput(new String[] {"0", String.valueOf(itemm.getId()), "1"});
        UserAction[] actions = {new DeleteAction(), new ExitAction()};
        new StartUIII().init(in, tracker, actions);
        assertThat(tracker.findById(itemm.getId()), is(nullValue()));
    }
}*/
