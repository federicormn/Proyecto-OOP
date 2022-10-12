package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;

public class BugHelper {

    // Se desea tener los bugs que tienen una severidad específica, filtrar lista ExecutedTest --> NO
    public static List<Bug> filterBySeverity(Severity severity, List<Bug> createdBugs)
    {
        List<Bug> bugsBySeverity = createdBugs.stream()
                .filter(tc -> tc.getSeverity() == severity).collect(Collectors.toList());
        return bugsBySeverity;
    }

    public static void showBugs(List<Bug> bugs){
        int i = 0;
        for (Bug oneBug:bugs)
        {
            System.out.println(bugs.get(i).getDescription());
            i++;
            //System.out.println(createdByQA.get(0).getDescription());
        }
    }
}
