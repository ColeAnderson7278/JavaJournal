import java.io.FileWriter;
import java.io.IOException;

public class Entry {
    FileWriter filewriter;
    String username;
    String message;

    public Entry(String username, String message) {
        this.username = username;
        this.message = message;
    }

    public void writeEntryToFile(){
        try{
            filewriter = new FileWriter(this.username + "Journal.txt");
            filewriter.write(this.message);
            filewriter.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
