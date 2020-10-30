package com.br.validator.form;


import com.br.validator.annotations.CpfCnpj;

public class DocumentForm {
    @CpfCnpj
    private String number;
    private String documentType;

}
