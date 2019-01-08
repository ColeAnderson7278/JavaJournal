import java.util.Scanner;

public class Project {
    static Scanner reader;
    static Entry entry;

    public static void main(String[] args) {
        reader = new Scanner(System.in);
        entry = new Entry(getUser(), getMessage());
        entry.writeEntryToFile();
        reader.close();
    }

    public static String getUser(){
        String user = reader.nextLine();
        return user;
    }

    public static String getMessage(){
        String message = reader.nextLine();
        return message;
    }
}
