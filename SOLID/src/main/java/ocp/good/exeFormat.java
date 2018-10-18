package ocp.good;

import static ocp.bad.FormatFile.EXE;

public class exeFormat implements ConvertFormatFile {
    public String convertFile(String file) {
        return EXE.toString();
    }
}
