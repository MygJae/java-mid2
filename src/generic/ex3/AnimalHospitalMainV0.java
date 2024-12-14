package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("Dog", 20);
        Cat cat = new Cat("Cat", 5);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
//         dogHospital.checkup(cat); // 다른 타입 입력: 컴파일 오류
        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("Dog1", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}