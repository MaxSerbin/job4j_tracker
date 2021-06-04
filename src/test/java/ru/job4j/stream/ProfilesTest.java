package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> prof = List.of(
                new Profile(new Address("AAA", "BBB", 1, 2)),
                new Profile(new Address("AAAa", "BBBb", 12, 22)),
                new Profile(new Address("AAAaa", "BBBbb", 122, 222))
        );
        Profiles prf = new Profiles();
        List<Address> rsl = prf.collect(prof);
        List<Address> expected = List.of(
        new Address("AAA", "BBB", 1, 2),
        new Address("AAAa", "BBBb", 12, 22),
        new Address("AAAaa", "BBBbb", 122, 222)
        );
        assertThat(rsl, is(expected));
    }
}