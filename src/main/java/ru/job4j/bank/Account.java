package ru.job4j.bank;

import java.util.Objects;
/**
 * Класс описывает модель банковского счета
 * @author Max Serbin
 * @version 1.0
 */
public class Account {
/** Поле реквизиты */
    private String requisite;
/** Поле баланс */
    private double balance;
/**
 * Конструктор - создание нового объекта с определенными параметрами
 * @param requisite - реквизиты
 * @param balance - баланс
 */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод получения значения поля {@link Account#requisite}
     * @return возвращает реквизиты
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод установления значения поля реквизиты
     * @param requisite - реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод получения значения поля {@link Account#balance}
     * @return возвращает баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод установления значения поля баланс
     * @param balance - баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }
/**
 * Переопределение метода
 */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
