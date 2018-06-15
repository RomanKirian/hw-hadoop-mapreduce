import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mapper {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String line = reader.readLine();
    while(line!=null){
    StringTokenizer tokenizer = new StringTokenizer(line);
    while(tokenizer.hasMoreTokens()){
      System.out.println(tokenizer.nextToken()+"\t"+"1");
    }
    line = reader.readLine();
    }
  }
}
