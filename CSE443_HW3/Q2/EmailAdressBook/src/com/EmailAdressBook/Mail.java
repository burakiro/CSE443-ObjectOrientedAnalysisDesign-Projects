package com.EmailAdressBook;

import java.util.ArrayList;
import java.util.Iterator;

public class Mail extends MailComponent {
    ArrayList mailComponents = new ArrayList();
    String email;
    String description;

    public Mail(String email, String description) {
        this.email = email;
        this.description = description;
    }
    public void add(MailComponent mailComponent) {
        mailComponents.add(mailComponent);
    }

    public void remove(MailComponent mailComponent) {
        mailComponents.remove(mailComponent);
    }

    public String getEmail() {
        return email;
    }
    public String getFullName() {
        return description;
    }
    public void print() {
        System.out.print("\n" + getEmail());
        System.out.println(", " + getFullName());
        System.out.println("---------------------");

        Iterator iterator = mailComponents.iterator();
        while (iterator.hasNext()) {
            MailComponent mailComponent =
                    (MailComponent)iterator.next();
            mailComponent.print();
    }
}}
