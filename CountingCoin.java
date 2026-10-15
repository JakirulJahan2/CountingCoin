
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingCoin {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("flips.txt");
        Scanner s = new Scanner(file);

        int heads = 0;
        int tails = 0;

        while (s.hasNext()) {
            if (s.next().equals("heads"))
                heads++;
            else
                tails++;
        }

        s.close();

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
