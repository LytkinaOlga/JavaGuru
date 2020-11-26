package by.bntu.fitr.poisit.lytkina.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        jobSite.addObserver(new Subscriber("Olga Lytkina"));
        jobSite.addObserver(new Subscriber("Elena Zavadskaya"));

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("Second Java Position");
    }
}
