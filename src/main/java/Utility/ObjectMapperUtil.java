package Utility;

public class ObjectMapperUtil {

    /**
     * This will get the object and return json String
     *
     * @param obj
     * @return String
     */
    public String ObjToString(Object obj) {
        String pojoString = null;
        try {
            com.fasterxml.jackson.databind.ObjectMapper objMapper = new com.fasterxml.jackson.databind.ObjectMapper();
            pojoString = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println("*** Converted Object to String...***");
        } catch (Exception e) {
            System.out.println("*** Failed to Convert Object to String...*** Error: " + e);
        }
        return pojoString;
    }

}
