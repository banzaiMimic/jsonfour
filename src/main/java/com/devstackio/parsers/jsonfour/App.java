package com.devstackio.parsers.jsonfour;

import com.devstackio.parsers.jsonfour.university.University;
import com.devstackio.parsers.jsonfour.university.UniversityParser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author devstack
 */
public class App {
    
    private static final String FILENAME = "demoData.uid";
    private static final String OUTPUT_FILENAME = "output.json";

    public static void main(String[] args) {
        
        List<String> listData = LineReader.INSTANCE.readLines( FILENAME );
        List<University> universityList = new ArrayList();
        
        listData.forEach((str) -> {
            universityList.add( UniversityParser.INSTANCE.parse(str) );
        });
        
        universityList.sort(Comparator.comparing(University::getName));
       
        Type listType = new TypeToken<List<University>>() {}.getType();

        Gson gson = new Gson();
        String json = gson.toJson(universityList, listType);
        
        try {
            Files.write(Paths.get("./"+OUTPUT_FILENAME), json.getBytes());
            System.out.println("-- saved json to : ./" + OUTPUT_FILENAME + " --");
        } catch (IOException e) {
        }
        
    }
    
}
