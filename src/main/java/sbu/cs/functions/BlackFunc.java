package sbu.cs.functions;

public class BlackFunc
{
    private static String output;

    //this handle 5 sections of black functions
    public static String functionsRender(String input, int action)
    {
        switch (action)
        {

            case 1 :
                output = reverce(input);
                break;

            case 2 :
                output = copySameIdx(input);
                break;
            case 3 :
                output = copyWord(input);
                break;
            case 4 :
                output = shiftWord(input);
                break;
            case 5 :
                output = changeAsci(input);
                break;
        }

        return output;
    }

     //1.reverce word like :
    //hasan --> nasah
    public static String reverce(String in)
    {
        String out = new StringBuffer(in).reverse().toString();
        return out;
    }

     //2.copy each index like :
    //hasan --> hhaassaann
    private static String copySameIdx(String in)
    {
        String out = "";
        char[] temp = in.toCharArray();
        char[] outChar = new char[2 * in.length()];

        outChar[0] = temp [0];
        int j = 0, count = 0;
        for (int i = 0; i < in.length(); i++)
        {
            while (true)
            {
                ++count;
                outChar[j] = temp[i];
                ++j;
                if (count == 2)
                {
                    break;
                }
            }
            count = 0;
        }
        out = String.valueOf(outChar);
        return out;
    }

     //3.copy word like :
    //hasan --> hasanhasan
    private static String copyWord(String in)
    {
        String out = in + "" + in;

        return out;
    }

     //4.shift word to right like :
    //hasan --> nhasa
    private static String shiftWord(String in)
    {
        String temp = (new StringBuilder(in).deleteCharAt(in.length() - 1)).toString();
        String out = in.charAt(in.length() - 1) + temp;

        return out;
    }

     //5.change asci code of word that sum from char like :
    // a --> z , g --> b ==> amir --> znri
    private static String changeAsci(String in)
    {
        String out = "";
        //z='122'/a='97'
        for (char temp : in.toCharArray())
        {
            out += (char)( 122 - (temp - 97) );
        }

        return out;
    }
}