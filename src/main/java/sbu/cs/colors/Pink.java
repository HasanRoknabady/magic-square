package sbu.cs.colors;

import sbu.cs.functions.WhiteFunc;

public class Pink extends HandleColor
{
    //left --> 1   up --> after left 2
    private String inputFromLeft, inputFromUp;
    private String output;

    public Pink(int action)
    {
        super(action);
    }

    public void setInputFromLeft(String inputFromLeft)
    {
        this.inputFromLeft = inputFromLeft;
    }

    public void setInputFromUp(String inputFromUp)
    {
        this.inputFromUp = inputFromUp;
    }

    public String getOutput()
    {
        this.output = WhiteFunc.functionsRender(inputFromLeft, inputFromUp, super.getAction());
        return output;
    }





}
