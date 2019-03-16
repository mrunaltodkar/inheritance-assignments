package com.capgemini.inheritance.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.SavingBankAccount;

class SavingBankAccountTest {
	
	
	@Test
	public void testWithdrawSavingBankAccountForSalaryAccountSufficientAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,true);
		assertEquals(25000,account.withdraw(10000));
	}
	
	@Test
	public void testWithdrawSavingBankAccountForSalaryAccountInSufficientAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,true);
		assertEquals(35000,account.withdraw(36000));
	}
	
	@Test
	public void testWithdrawSavingBankAccountForSavingAccountSufficientAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,false);
		assertEquals(15000,account.withdraw(20000));
	}
	
	@Test
	public void testWithdrawSavingBankAccountForSavingAccountInSufficientAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,false);
		assertEquals(35000,account.withdraw(40000));
	}
	
	@Test
	public void testDepositForSavingBabnkAccountInSalaryAccount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,true);
		assertEquals(45000,account.deposit(10000));
	}
}
