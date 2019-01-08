import java.util.ArrayList;
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
        System.out.println("Enter User: ");
        String user = reader.nextLine();
        return user;
    }

    public static ArrayList<String> getMessage() {
        ArrayList<String> message = new ArrayList<String>();
        System.out.println("Enter Message: ");
        while (message.lastIndexOf("END\n") == -1) {
            message.add(reader.nextLine() + "\n");
        }
        System.out.println(reader.tokens());
        return message;
    }
}
