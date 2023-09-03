package seminar_3;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInFile {
    public void writeDataInFile(String data, String path) {
        System.out.println(path);
        System.out.println(path.getClass().getSimpleName());
        try (FileWriter fw = new FileWriter(path, true)){
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
