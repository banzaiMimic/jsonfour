package com.devstackio.parsers.jsonfour.university;

/**
 *
 * @author devstack
 */
public enum UniversityParser {
    
    INSTANCE;
    
    public University parse( String line ) {
        
        University returnobj = new University();
        
        try {
            
            String[] pieces = line.split("\\|");

            returnobj.setId(pieces[0]);
            returnobj.setName(pieces[1]);
            returnobj.setCity(pieces[2]);
            returnobj.setState(pieces[3]);
            
        } catch (Exception e) {
        }
        
        return returnobj;
    }
    
}
