package com.bridgelabz;
import java.util.Scanner;

public class LineComparisonBuilder
{
    private static Scanner obj;
    private double length;
    public void length_of_line(int x1, int x2, int y1, int y2)
    {
        this.length=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        return;
    }
    public static void main(String[] arg)
    {
        obj = new Scanner(System.in);
        LineComparisonBuilder object=new LineComparisonBuilder();
        System.out.println("Enter the numbers x1,x2,y1,y2 ");
        int x1, x2, y1, y2;
        x1 = obj.nextInt();
        x2 = obj.nextInt();
        y1 = obj.nextInt();
        y2 = obj.nextInt();
        object.length_of_line(x1, x2, y1, y2);
        System.out.println("Length of line = " + object.length);
    }
}
