package ch18io.book.exercise.p07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args)  {
        String filePath = "C:\\Users\\admin\\IdeaProjects\\java20230828\\src\\ch18io\\book\\exercise\\p07\\Example.java";

        // BufferdReader.readLine
        // printStream.printf


//            FileReader fr = new FileReader(filePath);
//            BufferedReader br = new BufferedReader(fr);
//
//        int rowNumber = 0;
//        String rowData;
//        while(true) {
//            rowData = br.readLine();
//            rowNumber++;
//            if (rowData==null){
//                break;
//            }
////            System.out.println(rowNumber+": " + rowData);
//            System.out.printf("%2d: %s%n",rowNumber,rowData);
//        }
//        br.close(); fr.close();


        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            try(br; fr;) {

            int rowNumber = 0;
            String rowData;
            while(true) {
                rowData = br.readLine();
                rowNumber++;
                if (rowData==null){
                    break;
                }
//            System.out.println(rowNumber+": " + rowData);
                System.out.printf("%2d: %s%n",rowNumber,rowData);
              }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
