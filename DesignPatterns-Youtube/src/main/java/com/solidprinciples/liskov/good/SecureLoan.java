package com.solidprinciples.liskov.good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
