package com.example.transactionmangment;

import com.example.transactionmangment.services.BankAccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionmangmentApplicationTests {

	@Autowired
	BankAccountServiceImpl bankAccountService;

	@Test
	void testTransferMoney() {

		bankAccountService.transfer(100);

	}

}
