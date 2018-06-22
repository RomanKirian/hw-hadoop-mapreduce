import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class Reducer2 {
  public static class WC{
    public String word;
    public int count;

    public WC(String word, int count) {
      this.word = word;
      this.count = count;
    }

    public String getWord() {
      return word;
    }

    public int getCount() {
      return count;
    }
  }

  public static void main(String[] args) throws IOException {
    //try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
      //Map<String, Long> map = reader.lines().map(l->l.split("\t")[0]).collect(Collectors.groupingBy(l->l, Collectors.counting()));
      //map.forEach((k,v)-> System.out.println(k+":"+v));
      //reader.lines()
    //}
    /*WC[] arr = new WC[]{
            new WC("qwe",1),
            new WC("qwe",1),
            new WC("asd", 1)
    };
    Stream<WC> lines = Arrays.stream(arr);

    WC res = lines.reduce((a,b) -> {
      return new WC(a.getWord(),a.getCount()+b.getCount());
    }).orElse(new WC("",0));

    System.out.println(res.getWord() + ":" + res.getCount());*/
  }
}
