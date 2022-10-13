package ProjectOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DEV extends Employee
{
        private List<Bug> associatedBugs = new ArrayList<Bug>();

    public DEV(int id, String name, String lastname, int phoneNumber, String seniority) {
        super(id, name, lastname, phoneNumber, seniority);
    }


    // Getters & Setters
    public List<Bug> getAssociatedBugs()
    {
        return associatedBugs;
    }

    public void setAssociatedBugs(Bug oneBug)
    {
        this.associatedBugs.add(oneBug);
    }

    public void linkBugs(Bug oneBug)
    {

    }

    // 2) Se desea tener un método que me muestre los bugs asignados a un específico desarrollador
    public List<Bug> assignedBugsToDev(){
        List<Bug> associatedBug = associatedBugs.stream()
                .filter(tc -> tc.assignedTo.getId() == this.getId()).collect(Collectors.toList());
        return associatedBug;
    }
}