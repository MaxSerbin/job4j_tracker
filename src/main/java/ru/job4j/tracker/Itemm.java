package ru.job4j.tracker;

import java.util.Objects;

public class Itemm implements Comparable<Itemm> {
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

    @Override
    public int compareTo(Itemm another) {
        return  Integer.compare(id, another.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Itemm itemm = (Itemm) o;
        return Objects.equals(id, itemm.id) &&
                Objects.equals(name, itemm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
