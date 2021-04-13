package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса
 * @author Max Serbin
 * @version 1.0
 */
public class BankService {
    /** Поле содержит всех пользователей системы с привязанными к ним счетами */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента в систему
     * @param user - клиент
     */
    public void addUser(User user) {
      users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет клиенту новый счет
     * @param passport - паспортные данные
     * @param account - счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
           List<Account> userAccounts = users.get(user);
           if (!userAccounts.contains(account)) {
               userAccounts.add(account);
           }
        }
    }

    /**
     * Метод поиска клиента по паспортным данным
     * @param passport - паспортные данные
     * @return возвращает клиента , если он существует в системе или
     * возвращает null , если клиента в системе нет
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод поиска счета по реквизитам
     * @param passport - паспортные данные
     * @param requisite - реквизиты
     * @return возвращает счет, если он существует или null , если
     * такого счета нет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
           for (Account acc : userAccounts) {
               if (acc.getRequisite().equals(requisite)) {
                   return acc;
               }
           }
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт
     * @param srcPassport - паспортные данные владельца (клиента) исходного счета
     * @param srcRequisite - реквизиты исходного счета
     * @param destPassport - паспортные данные владельца (клиента) счета - реципиента
     * @param destRequisite - реквизиты счета - реципиента
     * @param amount - платеж
     * @return возвращает: Если счёт не найден или не хватает денег на счёте srcAccount
     * (с которого переводят),
     * то метод должен вернуть false, в противном случае возвращает true
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accSrc = findByRequisite(srcPassport, srcRequisite);
        Account accDest = findByRequisite(destPassport, destRequisite);
        if (accSrc != null && accDest != null) {
            if (accSrc.getBalance() >= amount) {
                accSrc.setBalance(accSrc.getBalance() - amount);
                accDest.setBalance(accDest.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}
