package bankaccountapp.utilities;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class csv {

  // read data from the csv file a return as a list of strings
  public static List<String[]> read(String file) {
    List<String[]> data = new LinkedList<String[]>();
    String dataRow;
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      dataRow = br.readLine();
      while (dataRow != null) {
        String[] dataRecords = dataRow.split(",");
        data.add(dataRecords);
      }
    } catch (FileNotFoundException e) {
      System.out.println("CANNOT FIND FILE");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("CANNOT READ FILE");
      e.printStackTrace();
    }
    return data;
  }
}