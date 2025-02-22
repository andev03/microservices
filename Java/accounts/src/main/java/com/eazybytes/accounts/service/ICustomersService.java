package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import org.springframework.stereotype.Service;

public interface ICustomersService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
