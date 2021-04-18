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

    public void setInputs(String inputFromLeft, String inputFromUp)
    {
        this.inputFromLeft = inputFromLeft;
        this.inputFromUp = inputFromUp;

        this.output = WhiteFunc.functionsRender(inputFromLeft, inputFromUp, super.getAction());
    }

    public String getOutput()
    {
        return output;
    }





}
