package Utils;
import java.io.File;
public class Constants {
    public static String Campus = "Local Pine Campus";
    public static String Building = "Gold Building";
    public static String Floor = "Floor 1";
    public static int timeout = 60;
    public static ExcelUtility getData() {
        String path = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "TestData.xlsx";
        ExcelUtility utility = new ExcelUtility("Data", path);
        return utility;
    }



}

