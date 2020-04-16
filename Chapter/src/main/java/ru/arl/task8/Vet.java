package ru.arl.task8;

public class Vet{
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() +' '+animal.getLocation());
    }


    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0]=new Cat("Кош.корм","Дома",4,1);
        animal[1]=new Dog("Собач.корм","На выставке",4,1);
        animal[2]=new Horse("Сено","Хлев","Серая, длинная",4,1);

        for (int i=0; i<animal.length; i++){
            animal[i].treatAnimal();
        }

    }
}
