import java.util.Scanner;
import java.io.*;
public class Cryptography4Q
{
    public static void main(String[] args) throws IOException
    {
        String file = "encrypted.txt";
        decode(file);
    }
    public static void decode(String inputFilename) throws IOException
    {
        Scanner fileReader = new Scanner(new File(inputFilename));
        PrintWriter writer = new PrintWriter(new File("output.txt"));
        String fileText = "";
        String encrypted = "";
        while (fileReader.hasNext())
        {
            fileText += fileReader.nextLine();
        }
        fileText = fileText.toLowerCase();
        double[] eng = new double[26];    //english letter frequencies
        eng[0] = 0.08167; eng[1] = 0.01492; eng[2] = 0.0202; eng[3] = 0.04253;
        eng[4] = 0.12702; eng[5] = 0.0228; eng[6] = 0.02015; eng[7] = 0.06094;
        eng[8] = 0.06966; eng[9] = 0.00153; eng[10] = .01292; eng[11] = 0.04025;
        eng[12] = 0.02406; eng[13] = 0.06749; eng[14] = 0.07507; eng[15] = 0.01929;
        eng[16] = 0.00095; eng[17] = 0.05987; eng[18] = 0.06327; eng[19] = 0.09356;
        eng[20] = 0.02758; eng[21] = 0.00978; eng[22] = 0.02560; eng[23] = 0.00150;
        eng[24] = 0.01994; eng[25] = 0.00077;
        int[] freq = new int[26];
        int sumOfAllChar = 0;
        for (int i = 0; i < fileText.length(); i++)
        {
            int c = fileText.charAt(i);
            if (Character.isLetter(c))
            {
                freq[c - 97]++;
                sumOfAllChar++;
            }
        }
        double[] diff = new double[26];
        double total = 0;
        for (int i = 0; i < 26; i++)
        {
            diff[i] = eng[i] - ((freq[i] / sumOfAllChar) * 100);
            total += diff[i] / 26;
        }
        for (int i = 0; i < fileText.length(); i++)
        {
            int c = fileText.charAt(i);
            if (Character.isLetter(c))
            {
                c += (int)total;
                if (c < 97)
                {
                    c = (c - 97) + 123;
                }
            }
            encrypted += (char)c;
        }
        writer.println(encrypted);
        writer.close();
        System.out.println((int)(total));
        System.out.println(fileText);
        System.out.println(encrypted);
    }
}