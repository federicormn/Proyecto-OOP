package ProjectOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DEV extends Employee
{
        private List<Bug> associatedBugs = new ArrayList<Bug>();

        public DEV(){
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
    public List<Bug> assignedBugsToDev(int id){
        List<Bug> associatedBug = associatedBugs.stream()
                .filter(tc -> tc.assignedTo.getId() == id).collect(Collectors.toList());

        //System.out.println("Bugs asociados: "+associatedBug);
        //ESTO TAMPOCO VA ACA - CREAR METODO A PARTE PARA MOSTRAR
        int i = 0;
        for (Bug oneBug:associatedBug)
        {

            System.out.println(associatedBug.get(i).getDescription());
            i++;
            //System.out.println(createdByQA.get(0).getDescription());
        }
        return associatedBug;
    }

}


