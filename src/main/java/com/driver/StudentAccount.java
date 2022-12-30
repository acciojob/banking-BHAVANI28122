package com.driver;

public class StudentAccount extends BankAccount{

     String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default;
        this.setName(name);
        this.setBalance(balance);
        this.setMinBalance(0);
        this.institutionName = institutionName;

    }
    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

}
