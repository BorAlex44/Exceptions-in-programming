package seminar_3;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParsingData parsingData = new ParsingData();
        String fileName = null;
        WriteDataInFile writeDataInFile = new WriteDataInFile();
        HashMap<String, Object> data = parsingData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            }catch (DataException e){
                data = parsingData.parsInputData();
            }
        }
        fileName = data.get("lastname") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }
        System.out.println(data);
        String filePath = fileName;
        System.out.println(filePath);
        writeDataInFile.writeDataInFile(String.valueOf(sb), filePath);
    }
}
