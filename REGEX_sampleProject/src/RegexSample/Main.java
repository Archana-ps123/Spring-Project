package RegexSample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		String input;
		String regex = null;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  Pattern p  = Pattern.compile(regex);
	  input = br.readLine();
	  regex = "?=.*[0-9]";
	 

	}

}
