package com.EmailAdressBook;

public class MailTestDrive {
    public static void main(String args[]) {
        MailComponent cengstudents =
                new Mail("cengstudents@gtu.edu.tr", "COMPUTER ENGINEERING STUDENTS");
        MailComponent iestudents =
                new Mail("iestudents@gtu.edu.tr", "INDUSTRIAL ENGINEERING STUDENTS");
        MailComponent mestudents =
                new Mail("mestudents@gtu.edu.tr", "MACHINE ENGINEERING STUDENTS");
        MailComponent archstudents =
                new Mail("archstudents@gtu.edu.tr", "ARCHITECTURE STUDENTS");

        MailComponent allStudents = new Mail("allstudents@gtu.edu.tr", "ALL STUDENTS");

        allStudents.add(cengstudents);
        allStudents.add(iestudents);
        allStudents.add(mestudents);
        allStudents.add(archstudents);

        cengstudents.add(new MailItem(
                "alivelioglu@xyz.com",
                "Ali Velioglu"));

        cengstudents.add(new MailItem(
                "ahmetmehmetoglu@xyz.com",
                "Ahmet Mehmetoglu"));

        MailComponent kutaytekinirk = new MailItem("kutaytekinirk@xyz.com",
                "Kutay Tekinirk");

        archstudents.add(new MailItem(
                "bilgeonarici@xyz.com",
                "Bilge Onarici"));

        mestudents.add(kutaytekinirk);

        iestudents.add(new MailItem(
                "edagulsesoylu@xyz.com",
                "Eda Gülse Soylu"));


        MailAdmin mailadmin = new MailAdmin(allStudents);

        mailadmin.printMenu();

        mestudents.remove(kutaytekinirk);

        mailadmin.printMenu();
    }
}
