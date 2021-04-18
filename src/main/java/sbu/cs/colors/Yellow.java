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

    public void setOutput(String output)
    {
        this.input = input;
        this.output = BlackFunc.functionsRender(input, super.getAction());
    }

    public String getOutPut()
    {
        return output;
    }
}
