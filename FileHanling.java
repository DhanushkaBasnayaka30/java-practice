import java.io.File;// for import  the file
import java.util.Scanner; // to readt file
// import java.io.FileNotFoundException; // to error handle
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter;

public class FileHanling {

  public static void CreateFile() {
    try {
      File myFile = new File("TestFile2.txt");
      if (myFile.createNewFile()) {
        System.out.println("File Create at" + myFile.getPath() + myFile.getName());
      } else {
        System.out.println("Already created");
      }
    } catch (IOException e) {
      System.out.println(e + "Error occured!");
    }
  }

  public static void WriteFile() {
    try {
      FileWriter myWriter = new FileWriter("TestFile2.txt");
      myWriter.write("this the first time  i am using java FileWriter package to write a file");
      myWriter.close();
      System.out.println("Successfuly wrot to the file");

    } catch (IOException e) {
      System.out.println(e + "An Error Ocurred");
    }
  }

  public static void main(String[] args) {
    // try {

    // File MyFile = new File("UserInput.java");
    // Scanner myReader = new Scanner(MyFile);
    // while (myReader.hasNextLine()) {
    // String data = myReader.nextLine();
    // System.out.println(data);
    // }
    // } catch (FileNotFoundException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }
    // CreateFile();
    WriteFile();
  }
}
