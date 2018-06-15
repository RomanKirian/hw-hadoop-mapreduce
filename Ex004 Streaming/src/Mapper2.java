import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Mapper2 {
  public static void main(String[] args) throws IOException {
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
      //reader.lines().forEach(System.out::println);
      reader.lines()
        .map(l -> l.split(" "))
        .flatMap(Arrays::stream)
        .forEach((w)->{
          System.out.println(w+"\t"+"1");
        });
    }
  }
}
