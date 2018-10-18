package ocp.good;

import static ocp.bad.FormatFile.PDF;

public class pdfFormat implements ConvertFormatFile {
    public String convertFile(String file) {
        return PDF.toString();
    }
}
