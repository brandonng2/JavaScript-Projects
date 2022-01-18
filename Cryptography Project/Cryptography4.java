import java.util.Scanner;
import java.io.*;
public class Cryptography4
{
    public static void main(String[] args) throws IOException
    {
        String file = "Ecrypted.txt";
        String fileDecoder = "Decorderfile.txt";
        decoder(file, fileDecoder);
    }
    public static void decoder(String fileInput, String fileDecoder) throws IOException
    {
        Scanner fileReader = new Scanner(new File(fileInput));
        PrintWriter writer = new PrintWriter(new File(fileDecoder));
        double[] freq = new double[26];
        int sumLetters = 0;
        String fileText = "";
        String decoder = "";
        /////////////////////////////////////////////////
        while (fileReader.hasNext())
        {
            fileText += fileReader.nextLine();
        }
        fileText = fileText.toLowerCase();
        /////////////////////////////////////////////////
        for (int i = 0; i < fileText.length(); i++)
        {
            if (Character.isLetter((int) fileText.charAt(i)))
            {
                freq[(int) fileText.charAt(i) - 97]++;
                sumLetters++;
            }
        }
        /////////////////////////////////////////////////
        for (int i = 0; i < freq.length; i++)
        {
            freq[i] = (freq[i] / sumLetters) * 100;
        }
        /////////////////////////////////////////////////
        double max  = 0;
        int shiftValue;
        int assumedE = 0;
        for (int i = 0; i < freq.length; i++)
        {
            if(freq[i] > max)
            {
                max = freq[i];
                assumedE = i;
            }
        }
        shiftValue = 4 - assumedE;
        /////////////////////////////////////////////////
        for (int i = 0; i < fileText.length(); i++)
        {
            int c = fileText.charAt(i);
            if (c >= 97 && c <= 122)
            {
                c = c + shiftValue;
                if (c < 97)
                {
                    c = c + 26;
                }
                else if ( c > 122)
                {
                    c = c - 26;
                }
                    decoder += (char) c;
            }
            else
            {
                decoder += (char)c;
            }
        }
        /////////////////////////////////////////////////
        writer.println(decoder);
        writer.close();
        System.out.println(decoder);
    }
}