package com.account.account.dto.Converter;

import com.account.account.dto.AccountCustomerDto;
import com.account.account.dto.AccountDto;
import com.account.account.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccountCustomerDto convertToAccountCustomer(Customer from){
        if (from == null){
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(
                from.getId(),
                from.getName(),
                from.getSurname()
        );
    }
}
