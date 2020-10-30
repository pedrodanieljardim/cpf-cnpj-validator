package com.br.validator.annotations;

import com.br.validator.service.CpfCnpjValidator;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
@Constraint(validatedBy = {CpfCnpjValidator.class})
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface CpfCnpj {
    String message() default "CPF/CNPJ inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
