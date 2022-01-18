import java.util.Scanner;
import java.io.*;
public class Cryptography3
{
    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(System.in);
        String file = "Mytext.txt";
        String fileEncrypt = "Ecrypted.txt";
        System.out.print("Enter a shift value: ");
        int shiftValue = reader.nextInt();
        encryption(file, fileEncrypt, shiftValue);
    }

    public static void encryption(String fileInput, String fileEncrypted, int shift) throws IOException
    {
        Scanner fileReader = new Scanner(new File(fileInput));
        PrintWriter writer = new PrintWriter(new File(fileEncrypted));
        String fileText = "";
        String e = "";
        while (fileReader.hasNext())
        {
            fileText += fileReader.nextLine();
        }
        fileText = fileText.toLowerCase();
        for (int i = 0; i < fileText.length(); i++)
        {
            int c = fileText.charAt(i);
            if (c == 32)
            {
                e += (char)c;
            }
            else
            {
                c += shift;
                if ( c > 122)
                {
                    c -= 25;
                }
                e += (char)c;
            }
        }
        writer.println(e);
        writer.close();
        System.out.println(fileText);
        System.out.println(e);
    }
}