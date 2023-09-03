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
                
            } else if (elem.matches("[0-9]+")) {
                dataDict.put("telephone", elem);
            } else if (elem.matches("[А-ЯЁа-яё]+")) {
                sb.append(elem).append(" ");
            }else {
                try {
                    throw new DataException();
                }catch (DataException e) {
                    e.dataException(elem);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDict.put("firstname", fullName[1]);
            dataDict.put("lastname", fullName[0]);
            dataDict.put("surname", fullName[2]);
        }
        return dataDict;
    }
}
