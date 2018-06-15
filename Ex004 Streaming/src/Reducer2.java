import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Reducer2 {
  public static void main(String[] args) throws IOException {
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
      //Map<String, Long> map = reader.lines().map(l->l.split("\t")[0]).collect(Collectors.groupingBy(l->l, Collectors.counting()));
      //map.forEach((k,v)-> System.out.println(k+":"+v));
    }
  }
}
