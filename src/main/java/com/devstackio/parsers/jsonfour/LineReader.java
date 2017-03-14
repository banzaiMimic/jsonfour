package com.devstackio.parsers.jsonfour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devstack
 */
public enum LineReader {
    
    INSTANCE;
    
    public List<String> readLines( String filename ) {
        List<String> returnobj = new ArrayList();
        try {
            File file = new File( filename );
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    returnobj.add(line);
                }
            }
        } catch (IOException e) {}
        return returnobj;
    }
}
