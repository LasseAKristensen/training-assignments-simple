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
        if (isValid(counterAccount)){
            // 2. look up counter account and make transfer object:
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            return new Transfer(this, acct, amount);
        } else {
            throw new BusinessException("Invalid acount number");
        }
    }
    
    public static boolean isValid(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(number.charAt(i));
        }
        return sum % 11 == 0;
    }
}
