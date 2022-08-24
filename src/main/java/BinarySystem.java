import java.util.Scanner;
public class BinarySystem {


    public static void wordsToBinaryCode(String word){

        int[] powersOfTwo = {16, 8, 4, 2, 1};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] lettersIndex = new int[word.length()];
        String[] lettersBinaryCode = new String[word.length()];

        for (int i = 0; i < word.length(); i ++){
            String letter = Character.toString(word.charAt(i));
            for (int j = 0; j < alphabet.length(); j ++){
                if (letter.equalsIgnoreCase(Character.toString(alphabet.charAt(j)))){
                    lettersIndex[i] = alphabet.indexOf(letter.toLowerCase()) + 1;
                    if (letter.equals((Character.toString(alphabet.charAt(j))).toLowerCase())){
                        lettersBinaryCode[i] = "11";
                    } else if (letter.equals((Character.toString(alphabet.charAt(j))).toUpperCase())){
                        lettersBinaryCode[i] = "10";
                    }
                }
            }
        }


        for (int i = 0; i < lettersIndex.length; i ++){
            for (int j = 0; j < powersOfTwo.length; j ++){
                if (lettersIndex[i] >= powersOfTwo[j]){
                    lettersIndex[i] -= powersOfTwo[j];
                    lettersBinaryCode[i] += "1";
                } else {
                    lettersBinaryCode[i] += "0";
                }
            }
        }

        for (int i = 0; i < word.length(); i ++){
            System.out.print(lettersBinaryCode[i] + "\t");
        }


    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.nextLine();
        System.out.println("Enter your surname : ");
        String surname = in.nextLine();
        System.out.println("Your name in binary system : ");
        wordsToBinaryCode(name);
        System.out.println();
        System.out.println("Your surname in binary system : ");
        wordsToBinaryCode(surname);




    }
}

