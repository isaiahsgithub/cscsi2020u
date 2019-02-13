import java.io.*;
import org.apache.commons.csv.*;

public class CSVDemo{
  public static void main(String[] args){
    try{
      Reader in = new FileReader("data.csv");
      Iterable<CSVRecord> records =
      CSVFormat.DEFAULT.withHeader("First Name", "Last Name", "SID", "GRADE").parse(in);
      for (CSVRecord record: records){
        String lastname = record.get("Last Name");
        String firstName = record.get("First Name");
        String grade = record.get("GRADE");
        System.out.println(firstName + " " + lastname + " (" + grade + ") ");

      }
      }
      catch (IOException e){
        e.printStackTrace();
      }
    }





}
