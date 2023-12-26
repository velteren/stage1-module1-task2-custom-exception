package com.epam.mjc;

public class MyException extends IllegalArgumentException {
    private int detail;
    MyException(int detail) {
        this.detail = detail;
    }
    public String toString() {
        return "Could not find student with ID " + detail;
    }
}
