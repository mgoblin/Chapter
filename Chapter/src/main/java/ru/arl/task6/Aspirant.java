package ru.arl.task6;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    private String research = "нет";

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public void getAverageMark(double averageMark) {
        super.getAverageMark(averageMark);
        if (averageMark==5){
            System.out.println("Стипендия: 200");
        } else {
            System.out.println("Стпендия: 180");
        }

    }

    public static void main(String[] args) {
        Student ruben = new Student("Рубен", "Акопян", "5", 5);
        ruben.getAverageMark();

        Aspirant david = new Aspirant("Давид","Акопян","5",5);
        david.getAverageMark();


    }
} ///
