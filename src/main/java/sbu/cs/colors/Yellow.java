package sbu.cs.colors;

import sbu.cs.functions.BlackFunc;

public class Yellow extends HandleColor
{
    private String input;
    private String output;

    public Yellow(int action)
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
