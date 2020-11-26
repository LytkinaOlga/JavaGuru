package by.bntu.fitr.poisit.lytkina.iterator;

public class PaskalDeveloper implements Iterable{
    String name;
    String[] skills;

    public PaskalDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIteratorForPaskalDeveloper(this);
    }
}
