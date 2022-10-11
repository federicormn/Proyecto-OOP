package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;

public class DEV extends Employee
{
        private List<Bug> associatedBugs;

        public DEV(){
        }


    // Getters & Setters
    public List<Bug> getAssociatedBugs()
    {
        return associatedBugs;
    }

    public void setAssociatedBugs(List<Bug> associatedBugs)
    {
        this.associatedBugs = associatedBugs;
    }

    public void linkBugs(Bug oneBug)
    {

    }

    // 2) Se desea tener un método que me muestre los bugs asignados a un específico desarrollador
    public List<Bug> assignedBugsToDev(int id){
        List<Bug> associatedBug = associatedBugs.stream()
                .filter(tc -> tc.assignedTo.getId() == id).collect(Collectors.toList());
        return associatedBug;
    }

}


