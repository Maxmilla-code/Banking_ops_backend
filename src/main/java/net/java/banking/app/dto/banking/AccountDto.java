package net.java.banking.app.dto.banking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private long id;
    private String accountHolderName;
    private double balance;


}
