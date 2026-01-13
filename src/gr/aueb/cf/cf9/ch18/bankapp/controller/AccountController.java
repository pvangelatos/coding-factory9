package gr.aueb.cf.cf9.ch18.bankapp.controller;

import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.ValidationExcetion;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.ch18.bankapp.service.IAccountService;
import gr.aueb.cf.cf9.ch18.bankapp.validation.Validator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance)
        throws ValidationExcetion {
        AccountReadOnlyDTO readOnlyDTO;
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);

        // Validation
        Map<String, String> errors;
        errors = Validator.validateInsertDTO(insertDTO);

        if (!errors.isEmpty()) {
            throw new ValidationExcetion(errors.toString());
        }

        //Proceed to service
        readOnlyDTO = accountService.createNewAccount(insertDTO);
        return readOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount) throws AccountNotFoundException, ValidationExcetion {
        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        Map<String, String> errors;
        errors = Validator.validateDepositDTO(depositDTO);

        if (!errors.isEmpty()) {
            throw new ValidationExcetion(errors.toString());
        }

        accountService.deposit(depositDTO);
    }

    public void withdraw(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationExcetion, InsufficientBalanceException {
        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        // Validation
        Map<String, String> errors;
        errors = Validator.validateWithdrawDTO(withdrawDTO);

        if (!errors.isEmpty()) {
            throw new ValidationExcetion(errors.toString());
        }

        accountService.withdraw(withdrawDTO);
    }

    public BigDecimal getBalance(String iban)
            throws AccountNotFoundException, ValidationExcetion {

        // Validations
        Map<String, String> errors;
        errors = Validator.validateIban(iban);

        if (!errors.isEmpty()) {
            throw new ValidationExcetion(errors.toString());
        }

        return accountService.getBalance(iban);
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}
