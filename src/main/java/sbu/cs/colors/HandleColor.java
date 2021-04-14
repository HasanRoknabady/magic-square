package sbu.cs.colors;

public class HandleColor
{
    private int action;

    //set actions that detect func 1..5
    public HandleColor(int action)
    {
        this.action = action;
    }

    //get actions from father method
    protected int getAction()
    {
        return action;
    }
}
