package net.java.banking.app.service;
import net.java.banking.app.dto.banking.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);

}
