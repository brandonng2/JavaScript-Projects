public class LetterFrequency
{
    public static void main(String[] args)
    {
        String line = "Hello New Year! Welcome to Twenty Twenty.";
        line = line.toLowerCase();
        System.out.println(line);

        int[] freq = new int[26];
        // freq[0] is number of 'a's
        // freq[1] is number of 'b's

        char first = line.charAt(0);
        System.out.println(first);

        int num = (int)first;
        System.out.println(num); // ASCII value for 'h' is 104
        System.out.println((int) line.charAt(1));   // 'e' is 101
        System.out.println((int) 'a'); // 'a' is 97

        // If you read an 'h', how do you increase the frequency of 'h's?
        // like: freq[7]++
        freq[104 - 97]++;
        // if you found an 'a'
        freq[97 - 97]++;

        // Converting between data types
        char letter = (char)98; // cast an int into a char
        System.out.println(letter);

        // Converting char to String
        String letterString = Character.toString(letter); // change letter to a string
        System.out.println(letterString);
        letterString = String.valueOf(letter);
        System.out.println(letterString);

        // Add characters
        // String word = 'i' + 'n'; // Error: can't concatenate char's
        String word = "" + 'i' + 'n';
        System.out.println(word);

        System.out.println('i' + 'n');  // Adds the ascii values.. probably not what you intended

        // To determine whether a character is a letter...
        char charVal = 105;
        if (charVal >= 97 && charVal <= 122)
        {
            System.out.println("Yes, it's a letter");
        }

        if (Character.isLetter(charVal))
        {
            System.out.println("Yup, still a letter");
        }
    }
}