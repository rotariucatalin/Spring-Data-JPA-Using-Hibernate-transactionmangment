package com.example.transactionmangment.services;

import org.springframework.stereotype.Service;

public interface BankAccountService {

    void transfer(int amount);
}
