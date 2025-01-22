package Nuca_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReaderData {

    public static Properties data = reader("D:\\Nuca_Project1\\src\\test\\Files\\userdata.txt");

    public static void main(String[] args) {
        System.out.println("data: "+data);
    }
    private static Properties reader(String path) {

        Properties pro = new Properties();

        try {
            FileInputStream f = new FileInputStream(path);
            pro.load(f);

        } catch (FileNotFoundException e) {
            System.out.println("message" + e.getMessage());
        } catch (IOException e) {
            System.out.println("message" + e.getMessage());

        }
          return pro;

    }
}
