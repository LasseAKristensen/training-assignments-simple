/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sig.training.ch04;

/**
 *
 * @author lk
 */
public class Account {
    
    public Transfer makeTransfer(String counterAccount, Money amount)
            throws BusinessException {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++){
            sum = sum + (9 - i) * Character.getNumericValue(counterAccount.charAt(i));
        }
        if (sum % 11 == 0){
            // 2. look up counter account and make transfer object:
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            return result;
        } else {
            throw new BusinessException("Invalid acount number");
        }
    }
}
