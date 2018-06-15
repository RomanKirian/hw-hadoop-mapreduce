import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman Kirian on 14.06.2018.
 */
public class Reducer {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = null;
            String prevKey = "";
            int prevVal = 0;

            while((line = reader.readLine()) != null){
                String[] arr = line.split("\t");
                String key = arr[0];
                int value = Integer.parseInt(arr[1]);

                if(prevKey.isEmpty() || prevKey.equals(key)){
                    prevVal += value;
                }
                else {
                    System.out.println(prevKey + "\t" + prevVal);
                    prevVal = value;
                }
                prevKey = key;
            }

            if(!prevKey.isEmpty()){
                System.out.println(prevKey + "\t" + prevVal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
