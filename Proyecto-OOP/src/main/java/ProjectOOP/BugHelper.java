package ProjectOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BugHelper {
    public static List<Bug> filterBySeverity(Severity severity, List<Bug> createdBugs)
    {
        List<Bug> bugsBySeverity = createdBugs.stream()
                .filter(tc -> tc.getSeverity() == severity).collect(Collectors.toList());
        return bugsBySeverity;
    }
    public static void showBugs(Severity severity, List<Bug> bugs){
         List<Bug> bugList = filterBySeverity(severity, bugs);
        int i = 0;
        for (Bug oneBug:bugList)
        {
            System.out.println(bugList.get(i).getDescription());
            i++;
            //System.out.println(createdByQA.get(0).getDescription());
        }
    }
}
