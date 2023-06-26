package ma.emsi.ebankingbackend1.dtos;

import lombok.Data;
import ma.emsi.ebankingbackend1.enums.AccountStatus;

import java.util.Date;


@Data
public class SavingBankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;

    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
