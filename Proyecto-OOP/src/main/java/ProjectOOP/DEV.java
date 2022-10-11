package ProjectOOP;

import java.util.List;

public class DEV extends Employee {
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
}


