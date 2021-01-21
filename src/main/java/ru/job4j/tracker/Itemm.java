package ru.job4j.tracker;

public class Itemm {
    @Override
    public String toString() {
        return "Itemm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private int id;
        private String name;

        public Itemm(int id, String name) {
            this.id = id;
            this.name = name;
        }

    public Itemm(int id) { this.id = id; }

    public Itemm(String name) {
        this.name = name;
    }

        public int getId() { return id; }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
