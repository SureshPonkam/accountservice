package com.example.restservice.service;

import com.example.restservice.model.Account;

import java.util.Optional;

public interface AccountService {
    Account createAccount(Account account);

    Optional<Account> getAccountByNumber(String accountNumber);

    Account updateAccount(Account account);

    void deleteAccount(Long id);
}
