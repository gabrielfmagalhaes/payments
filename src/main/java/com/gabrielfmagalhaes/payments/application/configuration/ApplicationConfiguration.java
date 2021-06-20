package com.gabrielfmagalhaes.payments.application.configuration;

import com.gabrielfmagalhaes.payments.core.account.usecase.CreateAccountUseCase;
import com.gabrielfmagalhaes.payments.core.account.usecase.GetAccountByIdUseCase;
import com.gabrielfmagalhaes.payments.core.account.usecase.impl.CreateAccountUseCaseImpl;
import com.gabrielfmagalhaes.payments.core.account.usecase.impl.GetAccountByIdUseCaseImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public GetAccountByIdUseCase getAccountByIdUseCase() {
        return new GetAccountByIdUseCaseImpl();
    }

    @Bean
    public CreateAccountUseCase createAccountUseCase() {
        return new CreateAccountUseCaseImpl();
    }
}
