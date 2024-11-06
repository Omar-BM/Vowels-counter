import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);
        String phrase;

        while(true){
            System.out.println("Type a phrase to count the vowels (or type 0 to exit):");
            phrase = lecture.nextLine();

            if (phrase.equals("0")){
                System.out.println("Exiting...");
                break;
            }

            int vowel_a = 0;
            int vowel_e = 0;
            int vowel_i = 0;
            int vowel_o = 0;
            int vowel_u = 0;

            int counter = phrase.length();
            int flag = 0;


            while (flag < counter) {
                char vowel = phrase.charAt(flag);
                if (vowel == 'a') {
                    vowel_a++;
                } else if (vowel == 'e') {
                    vowel_e++;
                } else if (vowel == 'i') {
                    vowel_i++;
                } else if (vowel == 'o') {
                    vowel_o++;
                } else if (vowel == 'u') {
                    vowel_u++;
                }
                flag++;
            }
            System.out.println();
            System.out.println("vowel a = " + vowel_a);
            System.out.println("vowel e = " + vowel_e);
            System.out.println("vowel i = " + vowel_i);
            System.out.println("vowel o = " + vowel_o);
            System.out.println("vowel u = " + vowel_u);
            System.out.println();
        }

        lecture.close();
    }
}