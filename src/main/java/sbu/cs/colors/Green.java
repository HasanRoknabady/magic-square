package sbu.cs.colors;

import sbu.cs.functions.BlackFunc;

public class Green extends HandleColor
{
    private String input;
    private String output;

    //set and get
    public Green(int action)
    {
        super(action);
    }

    public void setOutput(String input)
    {
        this.input = input;
        this.output = BlackFunc.functionsRender(input, super.getAction());
    }

    public String getOutput()
    {
        return output;
    }

}
