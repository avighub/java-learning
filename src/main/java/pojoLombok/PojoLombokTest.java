package pojoLombok;

import Utility.ObjectMapperUtil;

public class PojoLombokTest {

    public static void main(String[] args) {
        AthleteAddress athleteAddress = AthleteAddress.builder()
                .city("Bangalore")
                .locality("Horamavu")
                .zip(550640)
                .state("Karnataka")
                .build();

        AthleteBrmStatus athleteBrmStatus = AthleteBrmStatus.builder()
                .clubMember("CNL")
                .rStatus(true)
                .srStatus(true)
                .build();

        AthleteBrmInfo athleteBrmInfo1 = AthleteBrmInfo.builder()
                .brmFinish(true)
                .brmMonth("Dec")
                .brmyear(2019)
                .clubName("BR")
                .build();
        AthleteBrmInfo athleteBrmInfo2 = AthleteBrmInfo.builder()
                .brmFinish(true)
                .brmMonth("Dec")
                .brmyear(2020)
                .clubName("BR")
                .build();

        AthleteAllInfo athleteAllInfo = AthleteAllInfo.builder()
                .id(100)
                .fname("Avishek")
                .lname("Behera")
                .address(athleteAddress)
                .brmInfo(athleteBrmInfo1) //Adding multiple json object
                .brmInfo(athleteBrmInfo2) //Adding multiple json object
                .brmStatus(athleteBrmStatus)
                .build();

        ObjectMapperUtil objectMapperUtil = new ObjectMapperUtil();

        System.out.println("Complete JSON= " + objectMapperUtil.ObjToString(athleteAllInfo));

    }


}
