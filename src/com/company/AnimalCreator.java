package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalCreator {
    public static Map<AnimalType, Supplier<Animal>> supplierByType = Map.of(
            AnimalType.CAT, Cat::new,
            AnimalType.DOG, Dog::new,
            AnimalType.DUCK, Duck::new

    );

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        AnimalType animalType =  AnimalType.valueOf(input);
        Animal animal = supplierByType.get(animalType).get();
        System.out.println(animal);
    }

}
class Animal{

}
class Dog extends Animal{

}
class  Cat extends Animal{

}
class Duck extends Animal{

}
enum AnimalType{
    DOG,
    CAT,
    DUCK
}
