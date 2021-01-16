package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();


   public Item(LocalDateTime created) {
      this.created = created;
   }

    public LocalDateTime getCreated() {
        return created;
    }


    public Item(int id) {
       this.id = id;
   }

   public Item(String name) {
       this.name = name;
   }

   public Item(int id, String name) {
       this.id = id;
       this.name = name;
   }

    public static void main(String[] args) {
        Item item = new Item(LocalDateTime.now());
        System.out.println("Дата и время : " + item.getCreated());
    }


}