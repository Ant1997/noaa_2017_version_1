package com.example.noaa_2017_version_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class DataController {
    // /station?id=AEM00041194 => Lists all lines with that ID
    @GetMapping("/station")
    public ArrayList<Data> findAllId(@RequestParam(value = "id") String idInput){
        String file = System.getProperty("user.dir")  +
                "\\src\\main\\java\\com\\example\\noaa_2017_version_1\\" +
                "2017.csv";
        BufferedReader reader = null;
        String line = "";
        ArrayList <Data> arrayList = new ArrayList<Data>();

        if (idInput == ""){
            return arrayList;
        }
        else {
            try {
                reader = new BufferedReader(new FileReader(file));
                while ((line = reader.readLine()) != null) {

                    String[] row = line.split(",");
                    if (row[0].equals(idInput)) {
                        Data newData;
                        if (row.length > 7) {
                            newData = new Data(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7]);
                        } else {
                            newData = new Data(row[0], row[1], row[2], row[3], row[4], row[5], row[6], "");
                        }
                        arrayList.add(newData);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
