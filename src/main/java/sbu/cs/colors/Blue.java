package sbu.cs.colors;

import sbu.cs.functions.BlackFunc;

public class Blue extends HandleColor
{
    private String inputFromUp, inputFromLeft;
    private String outputToDown, outputToRight;

    public Blue(int action)
    {
        super(action);
    }

    public String getOutputToDown()
    {
        this.outputToDown = BlackFunc.functionsRender(inputFromUp, super.getAction());
        return outputToDown;
    }

    public void setInputFromUp(String inputFromUp)
    {
        this.inputFromUp = inputFromUp;
    }

    public void setOutputToRight(String inputFromLeft)
    {
        this.inputFromLeft = inputFromLeft;
    }

    public String getOutputToRight()
    {
        this.outputToRight = BlackFunc.functionsRender(inputFromLeft, super.getAction());
        return outputToRight;
    }


}
