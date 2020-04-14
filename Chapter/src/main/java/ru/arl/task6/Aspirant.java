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

//    @Override
//    public void getAverageMark() {
//        super.getScholarship(averageMark);
//        if (averageMark==5){
//            System.out.println("Стипендия: 200");
//        } else {
//            System.out.println("Стипендия: 180");
//        }
//
//    }

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


    }
}
