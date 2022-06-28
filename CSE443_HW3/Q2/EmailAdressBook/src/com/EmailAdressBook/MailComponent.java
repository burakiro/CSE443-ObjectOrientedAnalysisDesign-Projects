package com.EmailAdressBook;

public abstract class MailComponent {

    public void add(MailComponent mailComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MailComponent mailComponent) {
        throw new UnsupportedOperationException();
    }

    public String getEmail() {
        throw new UnsupportedOperationException();
    }
    public String getFullName() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}