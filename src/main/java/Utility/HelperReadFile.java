package Utility;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class HelperReadFile {

    public static String readTextFile(String path) {
        String result = null;
        try {
            result = new String(Files.readAllBytes(Paths.get(path)));
            System.out.println("Successfully read json file, Path:" + path);
        } catch (Exception e) {
            System.out.println("Unable to read json file... Path:" + path);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Read key and values from yaml / yml file
     * Returns Map Object
     */
    public static void readYamlFile() {
        // TODO Auto-generated method stub
    }

    /**
     * This method takes properties object and return them with Map
     */
    public static Map<String, String> storePropertiesToMap(Properties properties) {

        Map<String, String> propertiesList = new HashMap<>();
        try {
            propertiesList.putAll(properties.entrySet()
                    .stream()
                    .collect(Collectors.toMap(e -> e.getKey().toString(),
                            e -> e.getValue().toString())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return propertiesList;
    }

    /**
     * This method takes properties file path and return them with Map
     */
    public static Map<String, String> readPropertiesFileToMap(String filePath) {

        Map<String, String> propertiesList = new HashMap<>();

        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
            propertiesList.putAll(properties.entrySet()
                    .stream()
                    .collect(Collectors.toMap(e -> e.getKey().toString(),
                            e -> e.getValue().toString())));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return propertiesList;

    }

    /**
     * Reads the properties file from src/main/resources/config.properties
     * And returns Properties object
     */
    // TODO : Add logging
    public Properties getPropertiesFromConfig() {
        Properties configProperties = new Properties();

        // store the current executing test class name
        String executingClass = this.getClass().getSimpleName();

        File file;
        FileInputStream fis;
        try {
//            file = new File(getClass().getClassLoader().getResource("config.properties").getFile());
            file = new File("./src/main/resources/config.properties");
            fis = new FileInputStream(URLDecoder.decode(file.getAbsolutePath(), "utf-8"));
//            Logger.getLogger(executingClass).info("Config file: " + URLDecoder.decode(file.getAbsolutePath(),"utf-8"));
            configProperties.load(fis);
        } catch (FileNotFoundException e) {
//            Logger.getLogger(executingClass).fatal("Configuration Error! config.properties file was not found!");
            e.printStackTrace();
        } catch (IOException e) {
//            Logger.getLogger(executingClass).error("ERROR reading from config.properties file!");
            e.printStackTrace();
        } catch (NullPointerException e) {
//            Logger.getLogger(executingClass).warn("Create config.properties file in src/main/resources folder to use framework methods!");
            e.printStackTrace();
        }

        return configProperties;
    }

    /**
     * Reads the properties file from src/main/resources/config.properties
     * And returns Properties object
     */
    // TODO : Add logging
    public Properties getPropertiesFromEnvConfig(String environment) {
        Properties configProperties = new Properties();

        // store the current executing test class name
        String executingClass = this.getClass().getSimpleName();

        File file;
        FileInputStream fis;
        try {
//            file = new File(getClass().getClassLoader().getResource(environment + ".properties").getFile());
            file = new File("./src/main/resources/" + environment.toLowerCase(Locale.ROOT) + ".properties");
            fis = new FileInputStream(URLDecoder.decode(file.getAbsolutePath(), "utf-8"));
            configProperties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return configProperties;
    }

    public static Object[][] readCsv(String filePath) {
        Object obj[][] = null;
        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
//            FileReader filereader = new FileReader(file);
            FileReader filereader = new FileReader(filePath);
            //Skipping Header
            CSVReader csvReader =
                    new CSVReaderBuilder(filereader).withSkipLines(1).build();
//            CSVReader csvReader = new CSVReader(filereader);
            List<String[]> allData = csvReader.readAll();

            int rowCount = allData.size();
            System.out.println("Row count= " + rowCount);

            String[] headers = allData.get(0);
//            for (String header : headers) {
//                System.out.print(header + "  | ");
//            }
            int colCount = headers.length;
            System.out.println("Col count=" + colCount);

            obj = new Object[rowCount][colCount];

            for (int i = 0, j = 0; i < rowCount; i++) {
                while (j < rowCount) {
                    String[] rowData = allData.get(i);
                    for (String cell : rowData) {
//                        System.out.print("Row: " + i + "Cell= " + j);
                        obj[i][j] = cell;
//                        System.out.println(" | " + obj[i][j]);
                        j++;
                    }
                }
                j = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapperUtil objectMapperUtil = new ObjectMapperUtil();
        System.out.println(objectMapperUtil.ObjToString(obj));
        return obj;
    }


    public static Object[][] readExcelBySheetName(String sheetName, String filePath)
            throws IOException, InvalidFormatException {

        // Option 1: Constructing XSSFWorkbook object using FileInputStream
        // object
        // File file = new
        // File(filePath);
        // FileInputStream fis = new FileInputStream(file);

        // Option 2: Constructing XSSFWorkbook object using String filepath
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        // Option 1: Getting the sheet by Name
        XSSFSheet sheet = workbook.getSheet(sheetName);

        // Option 2: Getting the sheet by Index
        // XSSFSheet sheet = workbook.getSheetAt(0);

        int totalRows = sheet.getLastRowNum();
        int totalColums = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Rows:" + totalRows + " || Cols" + totalColums);
        /**
         * Use opening Single quote ( ' ) to pass empty string in excel
         */
        // Read data from excel and store the same in the Object Array.
        Object obj[][] = new Object[totalRows][totalColums];
        for (int i = 0, j = 0; i < totalRows; i++) {
            while (j < totalColums) {
                sheet.getRow(i + 1).getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellType(CellType.STRING);
                obj[i][j] = sheet.getRow(i + 1).getCell(j).toString()
                        .trim();
//				System.out.println(obj[i][j]);
                j++;
            }
            j = 0;
        }

        // Closing Workbook connection
        workbook.close();
        //To print 2D array
//		System.out.println("Excel Data : "+ Arrays.deepToString(obj));
        ObjectMapperUtil objectMapperUtil = new ObjectMapperUtil();
        System.out.println(objectMapperUtil.ObjToString(obj));
        return obj;
    }

    public static JSONObject parseFileToJson(String filePath) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            Object obj = parser.parse(new FileReader(filePath));
            jsonObject = (JSONObject) obj;

            System.out.println("Successfully read json file, Path:" + filePath);
        } catch (Exception e) {
            System.out.println("Unable to read json file... Path:" + filePath);
            e.printStackTrace();
        }
        return jsonObject;
    }

    /*
     * Extract content in a pdf file from byteArray Need PDFBox library
     */

    public static String byteArrayToPDF(byte[] byteArrayOfPdf) throws IOException {
        System.out.println("<<< Save PDF Byte array to PDF Document Object >>>");
        PDDocument document = null;
        try {
            document = PDDocument.load(new ByteArrayInputStream(byteArrayOfPdf));
            System.out.println("<<< Extract required text from PDF document Object >>>");
            return new PDFTextStripper().getText(document);
        } finally {
            System.out.println("<<< Closing PDF Object >>>");
            document.close();
        }
    }


}
