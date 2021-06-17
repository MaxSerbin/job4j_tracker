package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
           List<Account> userAccounts = users.get(user.get());
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
    public Optional <User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();

    }

    /**
     * Метод поиска счета по реквизитам
     * @param passport - паспортные данные
     * @param requisite - реквизиты
     * @return возвращает счет, если он существует или null , если
     * такого счета нет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        if (user.isPresent()) {
            rsl = users.get(user.get())
                    .stream()
                    .filter(u -> u.getRequisite().equals(requisite))
                    .findFirst();
        }
        return rsl;
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
        Optional<Account> accSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accDest = findByRequisite(destPassport, destRequisite);
        if (accSrc.isPresent() && accDest.isPresent()) {
            if (accSrc.get().getBalance() >= amount) {
                accSrc.get().setBalance(accSrc.get().getBalance() - amount);
                accDest.get().setBalance(accDest.get().getBalance() + amount);
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
