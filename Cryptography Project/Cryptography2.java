import java.util.Scanner;
import java.io.*;
public class Cryptography2
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "sample1.txt";
        double[] frequencies = fileLetterFrequencies(fileName);

        for (int i = 0; i < frequencies.length; i++)
        {
            System.out.println((char)(i + 65) + " " + frequencies[i]);
        }
    }
    public static double[] fileLetterFrequencies(String fileName) throws IOException
    {
        Scanner fileReader = new Scanner(new File(fileName));
        double[] freq = new double[26];
        int sumLetters = 0;
        while (fileReader.hasNext())
        {
            String f = fileReader.next();
            f = f.toLowerCase();
            for (int i = 0; i < f.length(); i++)
            {
                if (Character.isLetter((int) f.charAt(i)))
                {
                    freq[(int) f.charAt(i) - 97]++;
                    sumLetters++;
                }
            }
        }
        for (int i = 0; i < freq.length; i++)
        {
            freq[i] = (freq[i] / sumLetters) * 100;
        }
        return freq;
    }
}