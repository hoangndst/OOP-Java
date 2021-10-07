package manager;
import java.text.ParseException;
import java.util.ArrayList;

public class STPLog {
    private ArrayList<STP> stpLog;
    
    public STPLog() {
        stpLog = new ArrayList<STP>();
    }

    public void addSTP(STP stp) {
        stpLog.add(stp);
    }

    public ArrayList<STP> getSTPLog() {
        return stpLog;
    }

    public void showSTPRecord() {
        int i = 1;
        System.out.println("+-----------------+-------------+");
        System.out.println("| STP Record      | Date        |");
        System.out.println("+-----------------+-------------+");
        for (STP stp : stpLog) {
            System.out.format("| %-15s | %-11s |%n", "STP" + i, Utils.formattedDate(stp.getDate()));
            i++;
        }   
        System.out.println("+-----------------+-------------+");
    }

    public void viewSTPReport(STP stp) {
        stp.viewSTPReport();
    }

    public void archiveSTPReport(STP stp) {
        addSTP(stp);
        System.out.println("STP record is created on: " + Utils.formattedDate(stp.getDate()));
    }

    public void retrieveSTPReport(String date) throws ParseException {
        for (STP stp : stpLog) {
            if (Utils.formattedDate(stp.getDate()).equals(date)) {
                viewSTPReport(stp);
                return;
            }
        }
    }
   
}
