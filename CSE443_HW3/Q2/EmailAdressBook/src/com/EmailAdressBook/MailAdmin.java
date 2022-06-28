package com.EmailAdressBook;

public class MailAdmin {

         MailComponent allStudents;
         public MailAdmin(MailComponent allStudents) {
            this.allStudents = allStudents;
        }
        public void printMenu() {
            allStudents.print();

}}
