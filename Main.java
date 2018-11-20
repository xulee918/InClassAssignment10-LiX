import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter a tweet: ");
        String tweet=keyboard.nextLine();
        int length=tweet.length();
        int count=0;
        int hashtags=0, attributions=0, links=0;
        char letter;


        if(length>140) {
            System.out.println("Excess characters" + (length - 140));
        }else{
                while (count < length) {
                    letter = tweet.charAt(count);
                    if (letter == '#') {
                        hashtags++;
                        count++;
                    }
                   else if (letter == '@') {
                        attributions++;
                        count++;
                    }
                   else if (tweet.startsWith("HTtp://", count)) {
                        links++;
                        count++;
                    } else {
                        count++;
                    }
                }



            System.out.println("Length Correct");
        System.out.println("Number of Hashtags: "+hashtags);
        System.out.println("Number of Attributions: "+attributions);
        System.out.println("Number of Links: "+links);
        }
    }
            }
