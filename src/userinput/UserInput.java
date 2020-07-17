package userinput;

//mport java.io.IOException;
//import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;


public class UserInput {

    public static void ParseCommand(List<String> worldlist) {

        String verb;
        String noun;
        List<String> commands = new ArrayList<>(Arrays.asList("take", "answer","move"));
        List<String> objects = new ArrayList<>(Arrays.asList("quiz", "guitar", "presentation"));
        if(worldlist.size()>2) {

            System.out.println("Allowed 2 word commands only");
        } else {
            verb = worldlist.get(0);
            if (!commands.contains(verb)) {
                System.out.println(verb + " is not a known verb!");
            }
        }
    }

    public static List<String> WordList(String input) {

        String delims = " \t, .:?!\"'";
        List<String> strlist = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, delims);
        String t;
        while (tokenizer.hasMoreTokens()) {

            t = tokenizer.nextToken();
            strlist.add(t);
        }
        return strlist;
    }

    public static String RunCommand(String inputstr) {
        List<String> wordlist;
        String S = "ok";
        String lowstr = inputstr.trim().toLowerCase();

        if (lowstr.equals("")) {
            S = "You must enter a command";
    } else {
        wordlist =WordList(lowstr);

            wordlist.forEach((astr) -> System.out.println(astr));
        ParseCommand(wordlist);
    }
    return S;
}

    public static void main(String[] args) throws IOException {

        BufferedReader in;
        String input;
        String output;
        //GameMap gameMap = new GameMap();
        in = new BufferedReader(new InputStreamReader(System.in));
        //q
        // gameMap.showIntro();
        do {
            System.out.println("> ");
            input = in.readLine();
            output = RunCommand(input);//gameMap.RunCommand(input);
            System.out.println(output);
        } while (!"q".equals(input));

    }
}




