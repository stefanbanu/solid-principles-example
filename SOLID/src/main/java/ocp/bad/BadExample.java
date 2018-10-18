package ocp.bad;

import static ocp.bad.FormatFile.CSV;
import static ocp.bad.FormatFile.PDF;
import static ocp.bad.FormatFile.TXT;

public class BadExample {

    public String convertFile(String format) {
        if (format.equals(".pdf")) {
            return PDF.toString();
        }if (format.equals(".csv")) {
            return CSV.toString();
        }if (format.equals(".txt")) {
            return TXT.toString();
        } // and the list goes on and on
        
        return CSV.toString();
    }
}
