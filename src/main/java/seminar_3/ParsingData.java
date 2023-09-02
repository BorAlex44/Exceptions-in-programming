package seminar_3;

import java.util.HashMap;

public class ParsingData {

    public HashMap<String, Object> parsInputData() {
        EntryData entryData = new EntryData();
        String[] data = entryData.inputData();
        HashMap<String, Object> dataDict = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String elem : data){
            if (elem.length() == 1) {
                if (elem.equals("f") || elem.equals("m")){
                    dataDict.put("gender", elem);
                } else {
                    try {
                        throw new GenderException();
                    }catch (GenderException e) {
                        e.genderException(elem);
                    }
                }
            } else if (elem.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                String[] arrayDate = elem.split("\\.");
                if (Integer.parseInt(arrayDate[0]) < 0 ||
                    Integer.parseInt(arrayDate[1]) < 0 ||
                    Integer.parseInt(arrayDate[2]) < 0 ||
                    Integer.parseInt(arrayDate[0]) > 31 ||
                    Integer.parseInt(arrayDate[1]) > 12 ||
                    Integer.parseInt(arrayDate[2]) > 2023) {
                    try {
                        throw new DateBirthdayException();
                    }catch (DateBirthdayException e){
                        e.dateBirthdayException(elem);
                    }
                }else {
                    dataDict.put("birthday", elem);
                }
                
            } else if () {
                
            }
        }
    }
}
