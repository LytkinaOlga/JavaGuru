package by.bntu.fitr.poisit.lytkina.iterator;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> skillsOfJavaDeveloper = List.of("Spring", "Hibernate", "MySQL", "Java", "Maven");
        JavaDeveloper javaDeveloper = new JavaDeveloper("Olya", skillsOfJavaDeveloper);
        Iterator iteratorJavaDeveloperSkills = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iteratorJavaDeveloperSkills.hasNext()){
            System.out.println(iteratorJavaDeveloperSkills.next().toString());
        }
        String[] skillsOfPaskalDeveloper = {"Paskal", "MySql", "Boriska's Maths"};
        PaskalDeveloper paskalDeveloper = new PaskalDeveloper("Nastya", skillsOfPaskalDeveloper);
        Iterator iteratorPaskalDeveloperSkills = paskalDeveloper.getIterator();

        System.out.println("Developer: " + paskalDeveloper.getName());
        System.out.println("Skills: ");

        while (iteratorPaskalDeveloperSkills.hasNext()){
            System.out.println(iteratorPaskalDeveloperSkills.next().toString());
        }
    }
}
