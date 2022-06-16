package _01_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personCount = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < personCount; i++) {
            String[] personData = scanner.nextLine().split("\\s+");

            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            Person person = new Person(name, age);
            personList.add(person);
        }

        personList.stream()
                .filter(person -> person.getAge() > 30)
                .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(el -> System.out.println(el));
    }
}
