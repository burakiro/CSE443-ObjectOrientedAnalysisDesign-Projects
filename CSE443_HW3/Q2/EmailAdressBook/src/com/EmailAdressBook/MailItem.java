package com.EmailAdressBook;

public class MailItem extends MailComponent {
    String eMail;
    String fullName;

    public MailItem(String eMail,
                    String fullName     )
    {
        this.eMail = eMail;
        this.fullName = fullName;
    }

    public String getEmail() {
        return eMail;
    }

    public String getFullName() {
        return fullName;
    }

    public void print() {
        System.out.print(" " + getEmail());
        System.out.println(" -- " + getFullName());
    }
}
