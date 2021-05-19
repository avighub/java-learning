package MapJava;

import DataProvider.AthleteDataProvider;
import Utility.ObjectMapperUtil;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedJsonPayloadUsingMap {

    @Test(dataProvider = "createUser", dataProviderClass = AthleteDataProvider.class)
    public void testJsonUsingMap(String id, String name, String city, String state, String locality, String zip, String brmYear, String brmMonth, String brmFinish) {
        Map<Object, Object> payloadMain = new HashMap<Object, Object>();
        Map<String, Object> athleteAddress = new HashMap<String, Object>();
        Map<String, Object> athleteBrmStatus1 = new HashMap<String, Object>();
        Map<String, Object> athleteBrmStatus2 = new HashMap<String, Object>();

        athleteAddress.put("city", city);
        athleteAddress.put("state", state);
        athleteAddress.put("locality", locality);
        athleteAddress.put("zip", zip);

        athleteBrmStatus1.put("brmYear", brmYear);
        athleteBrmStatus1.put("brmMonth", brmMonth);
        athleteBrmStatus1.put("brmFinish", brmFinish);

        athleteBrmStatus2.put("brmYear", 2021);
        athleteBrmStatus2.put("brmMonth", "May");
        athleteBrmStatus2.put("brmFinish", false);

        payloadMain.put("id", id);
        payloadMain.put("name", name);
        payloadMain.put("Address", athleteAddress);

        List<Object> brmStatsList = new ArrayList<Object>();
        brmStatsList.add(athleteBrmStatus1);
        brmStatsList.add(athleteBrmStatus2);

        payloadMain.put("brmStats", brmStatsList);

        ObjectMapperUtil objectMapperUtil = new ObjectMapperUtil();
        System.out.println(objectMapperUtil.ObjToString(payloadMain));

    }


}
