package by.bntu.fitr.poisit.lytkina.bean;

public class FitnessBotProject {
    private String name;
    private Developer teamLead;

    public FitnessBotProject() {
    }

    public FitnessBotProject(String name, Developer teamLead) {
        this.name = name;
        this.teamLead = teamLead;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamLead(Developer teamLead) {
        this.teamLead = teamLead;
    }

    @Override
    public String toString() {
        return "FitnessBotProject{" +
                "name='" + name + '\'' +
                ", teamLead=" + teamLead +
                '}';
    }
}
