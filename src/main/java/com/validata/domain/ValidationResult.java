package com.validata.domain;

public class ValidationResult {

    private final boolean valid;

    public ValidationResult(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

}
