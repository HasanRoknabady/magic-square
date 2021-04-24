package sbu.cs;

import sbu.cs.colors.*;

public class App //extends Machine
{
    /*
    public App(int n)
    {
        super(n);
    }

    public App()
    {
        super();
    }

     */

    public String firstInput;

    public String getFirstInput()
    {
        return firstInput;
    }

    public void setFirstInput(String firstInput)
    {
        this.firstInput = firstInput;
    }

    /**
     * use this function for magical machine question.
     *
     * @param n     size of machine
     * @param arr   an array in size n * n
     * @param input the input string
     * @return the output string of machine
     */
    public String main(int n, int[][] arr, String input)
    {
        Machine machine = new Machine(n);
        machine.handle = new HandleColor[n][n];
         //we shoud set all functions numbers first
        machine.setActions(arr, n);
        return machine.setAll(n, input);
    }

}