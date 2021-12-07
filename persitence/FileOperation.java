package persitence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileOperation {

    public ArrayList<String> loadTextFile(String path) {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader buffer;
        try {
            buffer = new BufferedReader(new FileReader(path));
            String line;
            while ((line = buffer.readLine()) != null) {
                list.add(line);
            }
            buffer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}