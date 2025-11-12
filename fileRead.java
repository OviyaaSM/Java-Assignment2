import java.io.*;
public class fileRead{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("demo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found Error!");
        }catch (IOException e){
            System.out.println("Error Reading File");
        }
    }
}