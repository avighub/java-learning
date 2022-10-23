package dataprovider;

import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "createUser", dataProviderClass = AthleteDataProvider.class)
    public void testDataProvider(String id, String name, String city, String state, String locality, String zip, String brmYear, String brmMonth, String brmFinish) {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("city:"+city);
        System.out.println("state:"+state);
        System.out.println("Locality:"+locality);
        System.out.println("Zip:"+zip);
        System.out.println("brmYear:"+brmYear);
        System.out.println("brmMonth:"+brmMonth);
        System.out.println("brmFinish:"+brmFinish);


    }
}
