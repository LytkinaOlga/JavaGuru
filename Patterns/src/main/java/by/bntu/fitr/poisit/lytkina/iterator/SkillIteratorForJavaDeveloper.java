package by.bntu.fitr.poisit.lytkina.iterator;

public class SkillIteratorForJavaDeveloper implements Iterator{
    int index;
    JavaDeveloper javaDeveloper;

    public SkillIteratorForJavaDeveloper(JavaDeveloper javaDeveloper) {
        this.javaDeveloper = javaDeveloper;
    }

    @Override
    public boolean hasNext() {
        if (index < javaDeveloper.skills.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return javaDeveloper.skills.get(index++);
    }
}
