package com.validata.validator;

public interface Validator<T> {

    boolean isValid(T input);

}
