package assignment2_exercises;

import java.util.ArrayList; 
import java.util.List;

public class StringParser {

    /**
     * Parses a string representation of an integer array into an actual integer array.
     * @param string the string representation of an integer array.
     * @return an array of integers parsed from the string.
     * @throws NumberFormatException if the string contains non-integer values.
     */
    public static int[] parseToStringArray(String string) {
        if (string.equals("[]")) {
            return new int[0];
        } 

        String[] aux = string.substring(1, string.length() - 1).split(",");
    
        int[] intArray = new int[aux.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(aux[i]);
        }

        return intArray;
    }


    /**
     * Parses a string representation of a list into a list of Comparable elements.
     * @param string the string representation of the list.
     * @return a list of Comparable elements parsed from the string.
     * @throws NumberFormatException if the string contains invalid numeric values.
     */
    @SuppressWarnings("rawtypes")
    public static List<Comparable> parseToStringList(String string) {
        List<Comparable> result = new ArrayList();

        if (string.equals("[]")) {
            return result;
        } else if (string.equals("null")) {
            return null;
        }

        String[] aux = string.substring(1, string.length() - 1).split(",");

        for (int i = 0; i < aux.length; i++) {
            if (aux[i].equals("null")) {
                result.add(null);
            } else {
                try {
                    result.add(Integer.parseInt(aux[i]));
                } catch (NumberFormatException e) {
                    try {
                        result.add(Double.parseDouble(aux[i]));
                    } catch (NumberFormatException a) {
                        result.add(aux[i]);
                    }
                }
            }
        }

        return result;
    }
}