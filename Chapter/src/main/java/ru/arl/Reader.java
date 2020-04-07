package ru.arl;

public class Reader {
    private String fIO;
    private int number;
    private String numOfReadTicket;
    private String faculty;
    private float birthDate;
    private String telephoneNum;


    public String getfIO() {
        return fIO;
    }

    public void setfIO(String fIO) {
        this.fIO = fIO;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public float getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(float birthDate) {
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
