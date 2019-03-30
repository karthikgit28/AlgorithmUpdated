package com.algorithm.program;

public class Pyramid {
	
	public static void main(String[] args) {
		
		int noOfRows = 9;
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
		
		
		//Otherpattern
		int noOfRows1 = 9;
		int rowCount1 = 1;
		
		for (int i = noOfRows1; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount1; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount1++;
        }
		
	}

}
