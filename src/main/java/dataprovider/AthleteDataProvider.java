package dataprovider;

import Utility.HelperReadFile;
import org.testng.annotations.DataProvider;

public class AthleteDataProvider {

    @DataProvider(name = "createUser")
    public Object[][] getCreateUserData() {
        String filePath = "./src/main/resources/DataProviderTestData/CreateUserTestData.csv";
        Object obj[][] = HelperReadFile.readCsv(filePath);
        return obj;
    }
}
