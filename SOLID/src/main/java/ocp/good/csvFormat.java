package ocp.good;

import static ocp.bad.FormatFile.CSV;

public class csvFormat implements ConvertFormatFile {

    public String convertFile(String file) {
        return CSV.toString();
    }
}
