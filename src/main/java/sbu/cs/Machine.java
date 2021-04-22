package sbu.cs;

import sbu.cs.colors.*;

public class Machine
{

    public HandleColor[][] handle;

    public Machine(int n)
    {
        handle = new HandleColor[n][n];
    }

    public Machine()
    { }


    /**
     * here in setAction METHOD we put all func act in handle array
     * @param arr
     * @param n
     */

    public void setActions(int[][] arr, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (((i == 0) || (j == 0)) && ((i != n - 1) && (j != n - 1)))
                {
                    Green green = new Green(arr[i][j]);
                    handle[i][j] = green;
                } else if (((i == n - 1) && (j == 0)) || ((j == n - 1) && (i == 0)))
                {
                    Yellow yellow = new Yellow(arr[i][j]);
                    handle[i][j] = yellow;
                } else if (((i == n - 1) || (j == n - 1)) && ((i != 0) && (j != 0)))
                {
                    Pink pink = new Pink(arr[i][j]);
                    handle[i][j] = pink;
                } else
                {
                    Blue blue = new Blue(arr[i][j]);
                    handle[i][j] = blue;
                }
            }

        }
    }

    /**
     * after that we set all of the values
     * @param n
     */
    //this is first row setting
    private void setFirstRow(int n)
    {
        for(int i = 0; i < n-2; i++)
        {
            String output = ((Green)(handle[0][i])).getOutput();

            if(i == 0)
            {
                ((Green)(handle[1][0])).setInput(output);
                ((Green)(handle[0][1])).setInput(output);

            }
            else
            {
                ((Blue)(handle[1][i])).setInputFromUp(output);
                ((Green)(handle[0][i+1])).setInput(output);

            }
        }
        ((Blue)(handle[1][n-2])).setInputFromUp(((Green)(handle[0][n-2])).getOutput());
        ((Yellow)(handle[0][n-1])).setInput(((Green)(handle[0][n-2])).getOutput());
        ((Pink)(handle[1][n-1])).setInputFromUp(((Yellow)(handle[0][n-1])).getOutput());
    }

    //this is mid setting
    private void setMidRows(int n, int row)
    {
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                String output = ((Green)(handle[row][i])).getOutput();
                ((Green)(handle[row+1][i])).setInput(output);
                ((Blue)(handle[row][i+1])).setOutputToRight(output);
            }
            else if(i == n-1)
            {
                String output = ((Pink)(handle[row][i])).getOutput();
                ((Pink)(handle[row+1][i])).setInputFromUp(output);
            }
            else if(i == n-2)
            {
                String rightOutput = ((Blue)(handle[row][i])).getOutputToRight();
                String downOutput = ((Blue)(handle[row][i])).getOutputToDown();
                ((Pink)(handle[row][i+1])).setInputFromLeft(rightOutput);
                ((Blue)(handle[row+1][i])).setInputFromUp(downOutput);
            }
            else
            {
                String rightOutput = ((Blue)(handle[row][i])).getOutputToRight();
                String downOutput = ((Blue)(handle[row][i])).getOutputToDown();
                ((Blue)(handle[row][i+1])).setOutputToRight(rightOutput);
                ((Blue)(handle[row+1][i])).setInputFromUp(downOutput);
            }
        }
    }


    //setting before last row
    private void setBeforeLastRow(int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                String output = ((Green)(handle[n-2][i])).getOutput();
                ((Blue)(handle[n-2][i+1])).setOutputToRight(output);
                ((Yellow)(handle[n-1][i])).setInput(output);
            }
            else if(i == n-1)
            {
                String output = ((Pink)(handle[n-2][i])).getOutput();
                ((Pink)(handle[n-1][i])).setInputFromUp(output);
            }
            else if(i == n-2)
            {
                String rightOutput = ((Blue)(handle[n-2][i])).getOutputToRight();
                String downOutput = ((Blue)(handle[n-2][i])).getOutputToDown();
                ((Pink)(handle[n-1][i])).setInputFromUp(downOutput);
                ((Pink)(handle[n-2][i+1])).setInputFromLeft(rightOutput);
            }
            else
            {
                String rightOutput = ((Blue)(handle[n-2][i])).getOutputToRight();
                String downOutput = ((Blue)(handle[n-2][i])).getOutputToDown();
                ((Blue)(handle[n-2][i+1])).setOutputToRight(rightOutput);
                ((Pink)(handle[n-1][i])).setInputFromUp(downOutput);
            }
        }
    }


    private void setLastRow(int n)
    {
        for(int i = 0; i < n-1; i++)
        {
            if(i == 0)
            {
                String output = ((Yellow)(handle[n-1][i])).getOutput();
                ((Pink)(handle[n-1][i+1])).setInputFromLeft(output);
            }
            else
            {
                String output = ((Pink)(handle[n-1][i])).getOutput();
                ((Pink)(handle[n-1][i+1])).setInputFromLeft(output);
            }
        }
    }


    //for setting and complete colors area
    public String setAll(int n, String input)
    {
        ((Green)handle[0][0]).setInput(input);
        setFirstRow(n);
        for(int i = 1; i < n-2; i++)
        {
            setMidRows(n, i);
        }
        setBeforeLastRow(n);
        setLastRow(n);
        //get last out put from pink color
        return ((Pink)handle[n-1][n-1]).getOutput();
    }





}
