package sbu.cs.functions;

public class WhiteFunc
{
    private static String output;

    //this handle 5 sections of white functions
    public static String functionsRender(String input1, String input2, int action)
    {
        switch (action)
        {
            case 1 :
                output = decussate(input1, input2);
                break;
            case 2 :
                output = copyAndReverce(input1, input2);
                break;
            case 3 :
                output = firstToLast(input1, input2);
                break;
            case 4 :
                output = evenYesOrNo(input1, input2);
                break;
            case 5 :
                output = sumInputsAndMod(input1, input2);
                break;
        }

        return output;
    }


     //1.decussate word like :
    //ali hasan --> a h l a i s a n --> ahlaisan
    private static String decussate(String in1, String in2)
    {
        String out = "";
        //find min for loop
        int idx = Math.min(in1.length(), in2.length());

        for (int i = 0; i < idx; i++)
        {
            out += ( in1.charAt(i) + "" + in2.charAt(i) );
        }
        out = out + in1.substring(idx, in1.length()) + in2.substring(idx, in2.length());
        return out;
    }

     //2.Copy firs input and reverce second input and match them like :
    //hasan ali --> hasanila
    private static String copyAndReverce(String in1, String in2)
    {
        String out = in1 + "" + BlackFunc.reverce(in2);
        return out;
    }

    //3.First index of first input and last index of second input and match them like :
    //hasan ali ==> h i a l s a a n --> hialsaan
    private static String firstToLast(String in1, String in2)
    {
        String out = "";
        //find min for loop
        int idx = Math.min(in1.length(), in2.length());

        int count = 0;
        for (int i = 0; i < idx; i++)
        {
            out += ( in1.charAt(i) + "" + in2.charAt(in2.length() - 1 - i) );
            count++;
        }
        out = out
                + in1.substring(idx, in1.length())
                + BlackFunc.reverce(in2.substring(0, in2.length() - count));
        return out;
    }

     //4.check if first input is even return it if is not return second input like :
    //hasan ali --> hasan hasn't even length --> return --> ali
    private static String evenYesOrNo(String in1, String in2)
    {
        int lengthFirsInput = in1.length();

        if (lengthFirsInput % 2 == 0)
        {
            return in1;
        }
        else
            return in2;
    }


    //5.sub each index and mod to 26
    private static String sumInputsAndMod(String in1, String in2)
    {
        String out = "";
        int idx = Math.min(in1.length(), in2.length());

        for(int i = 0; i < idx; i++)
        {
            char temp = (char) (((in1.charAt(i) - 97 + in2.charAt(i) - 97) % 26) + 97);
            out += temp;
        }

          out = out + in1.substring(idx) + in2.substring(idx);

        return out;
    }
}