package com.sample.shinyay.rest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumValidator implements ConstraintValidator<ValidEnumValue, Object> {

    private Class<? extends Enum<?>> enumClass;
    private boolean ignoreCase;

    @Override
    public void initialize(ValidEnumValue annotation) {
        enumClass = annotation.enumClass();
        ignoreCase = annotation.ignoreCase();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Null values are considered valid
        }

        if (value instanceof Integer) {
            // Validate Integer values
            for (Enum<?> enumValue : enumClass.getEnumConstants()) {
                if (((MyIntegerEnum) enumValue).getNum().equals(value)) {
                    return true;
                }
            }
        } else if (value instanceof String) {
            // Validate String values
            String stringValue = (String) value;
            for (Enum<?> enumValue : enumClass.getEnumConstants()) {
                if (ignoreCase) {
                    if (enumValue.name().equalsIgnoreCase(stringValue)) {
                        return true;
                    }
                } else {
                    if (enumValue.name().equals(stringValue)) {
                        return true;
                    }
                }
            }
        }

        return false; // Value does not match any enum constant
    }
}
