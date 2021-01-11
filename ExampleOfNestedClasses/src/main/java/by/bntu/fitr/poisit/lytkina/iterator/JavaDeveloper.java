package by.bntu.fitr.poisit.lytkina.iterator;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloper implements Iterable{
    String name;
    List<String> skills = new ArrayList<>();

    public JavaDeveloper(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIteratorForJavaDeveloper(this);
    }
}
