package ru.job4j.tracker;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class ItemmTest {

    @Test
    public void whenUp() {
        List<Itemm> items = Arrays.asList(new Itemm(3, "CCC"),
                new Itemm(2, "BBB"), new Itemm(1, "AAA"));
        Collections.sort(items);
        List<Itemm> sorted = Arrays.asList(new Itemm(1, "AAA"), new Itemm(2, "BBB"),
                new Itemm(3, "CCC"));
        assertEquals(sorted, items);
    }

    @Test
    public void whenDown() {
        List<Itemm> items = Arrays.asList(new Itemm(1, "AAA"), new Itemm(3, "CCC"),
                new Itemm(2, "BBB"));
        Collections.sort(items, Collections.reverseOrder());
        List<Itemm> sorted = Arrays.asList(new Itemm(3, "CCC"), new Itemm(2, "BBB"),
                new Itemm(1, "AAA"));
        assertEquals(sorted, items);
    }
}