package com.br.validator.form;
import com.br.validator.annotations.CpfCnpj;


public class CompanyForm {
    private String typeOfOperation;

    private String corporateName;

    private String tradeName;

    private String typeOfDocumentFinalReceivingUser;

    @CpfCnpj
    private String finalReceivingUser;

    private String typeOfFinalReceivingUser;

    private Long settlementBlocking;

    private String accreditationDate;

    private String mccCode;

    private String contactName;

    private String email;

    private String mobile;

    private String telephone;

    private String securityIpOption;

    private String pec;

    private String street;

    private String number;

    private String address;

    private String neighborhood;

    private String city;

    @Size(max = 2, message = "two character is the maximum size allowed")
    private String state;


}
