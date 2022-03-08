package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	   int rows,columns,tree,i,j,treeCount=0;
       Scanner sc = new Scanner(System.in);
       rows=sc.nextInt();
       columns=sc.nextInt();
       tree=sc.nextInt();
        int garden[][] = new int[rows][columns];
       for(i=0;i<rows;i++)
       {
           for(j=0;j<columns;j++)
           {
               garden[i][j]=++treeCount;
           }
       }
       for(i=0;i<rows;i++)
       {
           for(j=0;j<columns;j++)
           {
               if(garden[i][j]==tree) {
                   if ((i == 0 || j == 0 || j == columns - 1))
                   {
                       System.out.println("yes");
                       break;
                   }
                   else {
                       System.out.println("no");
                       break;
                   }
               }
           }
       }
    }
}
