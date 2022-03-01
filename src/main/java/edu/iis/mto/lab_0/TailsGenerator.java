package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String>listOfStrings= new ArrayList<String>();
        listOfStrings.add(value);
        String s=value;
        for(int i=0;i<value.length();i++){
            s=s.substring(1);
            listOfStrings.add(s);
        }
        return listOfStrings;
    }
}
