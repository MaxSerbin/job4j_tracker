package ru.job4j.lambda;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import java.util.List;
import java.util.Arrays;

public class FuncDiapTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> 2 * Math.pow(x, 2) + (2 * x) + 1);
        List<Double> expected = Arrays.asList(61D, 85D, 113D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        FuncDiap function = new FuncDiap();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(3, x));
        List<Double> expected = Arrays.asList(243D, 729D, 2187D);
        assertThat(result, is(expected));
    }
}