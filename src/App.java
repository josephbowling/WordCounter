import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader file = new FileReader("C:\\CSI2300\\WordCounter\\src\\input.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<String> wordList = new ArrayList<String>();
            ArrayList<Integer> wordCount = new ArrayList<Integer>();
            while (scanner.hasNext()) {
                String nextWord = scanner.next();
                if (wordList.contains(nextWord)) {
                    int index = wordList.indexOf(nextWord);
                    wordCount.set(index, wordCount.get(index) + 1);
                }
                else {
                    wordList.add(nextWord);
                    wordCount.add(1);
            }
        }
        scanner.close();
        for (int i = 0; i < wordList.size(); i ++) {
            PrintStream fileStream = new PrintStream("output.txt");
            System.setOut(fileStream);
            System.out.println(wordList.get(i) + ": " + wordCount.get(i));
        }




    } catch( IOException e) {
        System.out.println("Encounter an IOException");
        e.printStackTrace();
    }
}
}
