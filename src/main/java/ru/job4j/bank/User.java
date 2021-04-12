package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель клиента банка
 * @author Max Serbin
 * @version 1.0
 */
public class User {
    /** Поле паспортные данные */
    private String passport;
    /** Поле имя клиента */
    private String username;

    /**
     * Конструктор - создание нового объекта с определенными параметрами
     * @param passport - паспортные данные
     * @param username - имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод получения значения поля {@link User#passport}
     * @return возвращает паспортные данные
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод установления значения поля паспортные данные
     * @param passport - паспортные данные
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод получения значения поля {@link User#username}
     * @return возвращает имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод установления значения поля имя клиента
     * @param username - имя клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
