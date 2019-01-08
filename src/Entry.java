import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Entry {
    FileWriter filewriter;
    BufferedWriter writer;
    static String fileNameFormat = "Journal.txt";
    String username;
    String message;

    public Entry(String username, ArrayList<String> message) {
        this.username = username;
        this.message = Entry.toStringFromArray(message);
    }

    public static String toStringFromArray(ArrayList<String> array) {
        String message = "";
        array.remove(array.size() - 1);
        for (String item : array) {
            message += item;
        }
        return message;
    }

    public void writeEntryToFile(){
        String fileDateFormat = "( " + Calendar.getInstance().getTime() + " )";
        try{
            filewriter = new FileWriter(this.username + fileNameFormat, true);
            writer = new BufferedWriter(filewriter);
            writer.write(this.message + fileDateFormat + "\n");
            writer.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static String readEntryFromFile(String username) {
        String line = null;
        String filelines = "";
        try {
            FileReader filereader = new FileReader(username + fileNameFormat);
            BufferedReader reader = new BufferedReader(filereader);
            while ((line = reader.readLine()) != null) {
                filelines += line + "\n";
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return filelines;
    }
}
