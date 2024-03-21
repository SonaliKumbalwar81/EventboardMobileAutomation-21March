package Utils;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.*;
public class CommonUtils {
    public static String Campus = "Local Pine Campus";
    public static String Building = "Gold Building";
    public static String Floor = "Floor 1";
    public static int timeout = 60;
    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
            + "resources" + File.separator + "TestData.xlsx";
    public static String givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(generatedString);
        return generatedString;
    }
    public static void sleep(int sleepTimeout) throws InterruptedException {
        Thread.sleep(sleepTimeout * 1000);
    }
    public static String getFutureDate(int daysToAdd) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_WEEK, daysToAdd);
        Date time = cal.getTime();
        String dateStr = time.toString();
        String dayName = dateStr.substring(0, 3);
        String monthName = dateStr.substring(4, 7);
        String dayNum = dateStr.substring(8, 10);
        String formatDate = null;
        String day[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int index = Arrays.binarySearch(day, dayNum);
        if (index < 0) {
            formatDate= dayName+", "+monthName+" "+dayNum;
        } else {
            formatDate = dayName + ", " + monthName + " " + "0" + dayNum;
        }
        return formatDate;
    }
    public static String getDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd");
        LocalDateTime now = LocalDateTime.now();
        String dateStr = dtf.format(now);
        return dateStr;
    }

}