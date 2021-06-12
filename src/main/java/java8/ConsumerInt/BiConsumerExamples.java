package java8.ConsumerInt;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiConsumer;

public class BiConsumerExamples {

    /* *
     *   Example 1: Reading properties file
     */

    // Java 7 Way
    private static void getPropertiesValueJava7() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./src/main/java/java8/ConsumerInt/test.properties"));

        for (Map.Entry<Object, Object> entry : prop.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    //Java 8 Way
    private static void getPropertiesValueJava8() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./src/main/java/java8/ConsumerInt/test.properties"));

        System.out.println("=== OPTION1 ====");
        prop.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println("=== OPTION2 ====");
        BiConsumer<Object, Object> biConsumer = (k, v) -> System.out.println(k + ":" + v);
        prop.forEach(biConsumer);
        System.out.println("=== OPTION3 ====");
        prop.entrySet().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

    public static void getValuesFromMapUsingJava8() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Key1", "value1");
        hm.put("Key2", "value2");

        System.out.println("== Option1====");
        hm.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println("== Option2====");
        hm.keySet().forEach((k) -> System.out.println(k + ":" + hm.get(k)));

    }


    @Test
    public void testPropUsingJava7() throws IOException {
        getPropertiesValueJava7();
    }

    @Test
    public void testPropUsingJava8() throws IOException {
        getPropertiesValueJava8();
    }

    @Test
    public void testMapUsingJava8() {
        getValuesFromMapUsingJava8();
    }

}
