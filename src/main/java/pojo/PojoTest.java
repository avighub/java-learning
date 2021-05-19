package pojo;

import Utility.ObjectMapperUtil;

public class PojoTest {

    public static void main(String[] args) {
        CreateAthletePOJO createAth = new CreateAthletePOJO("IIII", "ddd", "ss", "SR");

        ObjectMapperUtil objectMapperUtil=new ObjectMapperUtil();
        System.out.println(objectMapperUtil.ObjToString(createAth));

    }


}
