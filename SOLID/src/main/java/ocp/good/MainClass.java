package ocp.good;

public class MainClass {
    public static void main(String[] args) {
        String s = convertFile("", new exeFormat());
        System.out.println("converted to " + s + " format");
    }
    public static String convertFile(String file,ConvertFormatFile convertStrategy) {
        return convertStrategy.convertFile(file);
    }
}
