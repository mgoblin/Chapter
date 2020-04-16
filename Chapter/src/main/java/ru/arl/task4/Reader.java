package ru.arl.task4;

import java.util.Date;

public class Reader {
    private String fullName;
    private String numOfReadTicket;
    private String faculty;
    private Date birthDate;
    private String telephoneNum;

    public Reader(String fullName, String numOfReadTicket, String faculty, Date birthDate, String telephoneNum) {
        this.fullName = fullName;
        this.numOfReadTicket = numOfReadTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.telephoneNum = telephoneNum;
    }

    public String getfIO() {
        return fullName;
    }

    public void setfIO(String fullName) {
        this.fullName = faculty;
    }

    public String getNumOfReadTicket() {
        return numOfReadTicket;
    }

    public void setNumOfReadTicket(String numOfReadTicket) {
        this.numOfReadTicket = numOfReadTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }


    public void returnBook(){}
    public void takeBook(){}
}
