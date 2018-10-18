package ocp.good;

import static ocp.bad.FormatFile.TXT;

public class txtFormat implements ConvertFormatFile {
    public String convertFile(String file) {
        return TXT.toString();
    }
}
