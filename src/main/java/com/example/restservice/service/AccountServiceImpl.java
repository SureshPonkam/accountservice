package com.example.restservice.service;

import com.example.restservice.model.Account;
import com.example.restservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> getAccountByNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}