package ru.job4j.ex;

public class Fact {

        public static void main(String[] args) {
            Fact fact = new Fact();
            try {
                System.out.println("Результат : " + fact.calc(10));
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("Результат : " + fact.calc(-1));
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }

        public static int calc(int n) throws IllegalArgumentException {

            if (n < 0) {
                throw new IllegalArgumentException("n should be larger then 0.");
            }
            int rsl = 1;
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
}
