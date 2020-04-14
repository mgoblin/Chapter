package ru.arl.task6;

public class Aspirant extends Student {

    private String research = "нет";

    public Aspirant(String firstName, String lastName, String group, double averageMark, String research) {
        super(firstName, lastName, group, averageMark);
        this.research = research;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public double getScholarship() {
        if (this.averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public static void main(String[] args) {
        Student ruben = new Student("Рубен", "Акопян", "5", 5);
        ruben.getAverageMark();

        Aspirant david = new Aspirant(
                "Давид",
                "Акопян",
                "5",
                5,
                "фигня всякая");
        david.getAverageMark();

        Student mike = new Aspirant(
                "Михаил",
                "Голованов",
                "группа1",
                2.0,
                "Влияние зрения на пение и пения и на зрения");

        Object mikeObj = new Aspirant(
                "Михаил",
                "Голованов",
                "группа1",
                2.0,
                "Влияние зрения на пение и пения и на зрения");

        Student[] ruben1 = new Student[2];
        ruben1[0]=Student;
        ruben1[1]=Aspirant;


    }
}
