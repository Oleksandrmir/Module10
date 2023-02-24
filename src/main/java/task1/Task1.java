package task1;

import java.io.*;

public class Task1 {

    public static void main(String[] args) throws IOException {
        File file = new File("D://Project/Module10/src/main/java/task1/file.txt");

        System.out.println(validPhoneNumbers(file));
    }

    public static String validPhoneNumbers(File file) throws IOException {

        String template1 = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";
        String template2 = "\\d{3}-\\d{3}-\\d{4}";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        String result = "";

        while ((line = bufferedReader.readLine()) != null) {

            if (line.matches(template1) || line.matches(template2)) {
                result += line + "\n";
            }
        }
        return result;
    }
}