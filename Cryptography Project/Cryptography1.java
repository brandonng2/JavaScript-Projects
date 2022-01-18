public class Cryptography1
{
    public static void main(String[] args)
    {
        String word = "Aardvark";
        int[] frequencies = stringLetterFrequencies(word);
        for (int freq : frequencies)
        {
            System.out.print(freq + " ");
        }
        System.out.println();
    }
    public static int[] stringLetterFrequencies(String w)
    {
        int[] freq = new int[26];
        w = w.toLowerCase();
        for (int i = 0; i < w.length(); i++)
        {
            freq[(int)w.charAt(i) - 97]++;
        }
        return freq;
    }
}
