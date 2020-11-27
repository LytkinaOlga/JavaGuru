package by.bntu.fitr.poisit.lytkina.observer;

import java.util.Arrays;
import java.util.stream.Stream;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        jobSite.addObserver(new Subscriber("Olga Lytkina"));
        jobSite.addObserver(new Subscriber("Elena Zavadskaya"));

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("Second Java Position");

        int[] array = {1,2,3,4,5};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
    }
}
