package org.example.util;

import com.csvreader.CsvReader;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileUtil {


    public static List<Map<String, String>> readCsv(String filePath) {
        List<Map<String, String>> mapList = new ArrayList<>();
        try{
            CsvReader reader = new CsvReader(filePath, ',', StandardCharsets.UTF_8);
            reader.readRecord();
            String[] header = reader.getValues();
            while(reader.readRecord()){
                String[] row = reader.getValues();
                Map<String, String> map = new HashMap<>();
                for(int i = 0; i < row.length; i++){
                    map.put(header[i], row[i]);
                }
                mapList.add(map);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapList;
    }


}
