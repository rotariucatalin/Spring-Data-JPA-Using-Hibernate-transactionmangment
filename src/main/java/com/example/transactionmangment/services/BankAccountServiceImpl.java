package com.example.transactionmangment.services;


import com.example.transactionmangment.models.BankAccount;
import com.example.transactionmangment.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired
    BankAccountRepository bankAccountRepository;

    @Override
    @Transactional
    public void transfer(int amount) {

        BankAccount obamaAccount =  bankAccountRepository.findById(1).get();
        obamaAccount.setBal(obamaAccount.getBal() - amount);
        bankAccountRepository.save(obamaAccount);

        if(true) {
            throw new RuntimeException();
        }

        BankAccount trumpAccount =  bankAccountRepository.findById(2).get();
        trumpAccount.setBal(trumpAccount.getBal() + amount);
        bankAccountRepository.save(trumpAccount);

    }
}
