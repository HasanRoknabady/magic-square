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

    public void setInput(String input)
    {
        this.input = input;
    }

    public String getOutput()
    {
        this.output = BlackFunc.functionsRender(input, super.getAction());
        return output;
    }

}
