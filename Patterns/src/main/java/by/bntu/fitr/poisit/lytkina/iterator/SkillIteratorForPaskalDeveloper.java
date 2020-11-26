package by.bntu.fitr.poisit.lytkina.iterator;

public class SkillIteratorForPaskalDeveloper implements Iterator{
    int index;
    PaskalDeveloper paskalDeveloper;

    public SkillIteratorForPaskalDeveloper(PaskalDeveloper paskalDeveloper) {
        this.paskalDeveloper = paskalDeveloper;
    }

    @Override
    public boolean hasNext() {
        if (index < paskalDeveloper.skills.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return paskalDeveloper.skills[index++];
    }
}
