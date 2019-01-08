import java.io.*;
import java.util.Calendar;

public class Entry {
    FileWriter filewriter;
    //    FileReader filereader;
    BufferedWriter writer;
    //    BufferedReader reader;
    static String fileNameFormat = "Journal.txt";
    String username;
    String message;

    public Entry(String username, String message) {
        this.username = username;
        this.message = message;
    }

    public void writeEntryToFile(){
        try{
            filewriter = new FileWriter(this.username + fileNameFormat, true);
            writer = new BufferedWriter(filewriter);
            writer.write(this.message + "\n");
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
