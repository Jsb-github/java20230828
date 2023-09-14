package ch11exception.lecture;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.Connection;


public class C22throws {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("","","");
        var inpu = new FileInputStream("");
        Class.forName("");

    }
}
