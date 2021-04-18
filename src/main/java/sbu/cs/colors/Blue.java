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

    public void setOutputToDown(String inputFromUp)
    {
        this.inputFromUp = inputFromUp;
        this.outputToDown = BlackFunc.functionsRender(inputFromUp, super.getAction());
    }

    public String getOutputToDown()
    {
        return outputToDown;
    }

    public void setOutputToRight(String inputFromLeft)
    {
        this.inputFromLeft = inputFromLeft;
        this.outputToRight = BlackFunc.functionsRender(inputFromLeft, super.getAction());
    }

    public String getOutputToRight()
    {
        return outputToRight;
    }


}
