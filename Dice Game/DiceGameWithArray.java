package MyPackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DiceGameWithArray {

	public static void main(String[] args) {	
		
		int[] evennumber = new int[4];
	    evennumber[0] = 0;
	    evennumber[1] = 2;
	    evennumber[2] = 4;
	    evennumber[3] = 6;
	    int[] oddnumber = new int[4] ;
	    oddnumber[0]=1;
	    oddnumber[1]=3;
	    oddnumber[2]=5;
	    int i;
	    
	    
	    String a = " Win ", b = " Lose " ;
	    int numberrd ;
	    
	    
	    //do
	    //{
	    numberrd = 0 +(int)(Math.random() * 6 );
	    String oddeven = JOptionPane.showInputDialog("Rolling the dice...\nNumber between 0 to 6\nPlease pick ODD or EVEN:");
	    
	    // ODD
		// Not sure why the loop? ...See the MOD operator %  ...n % 2 == 0 means even
	    for(i=0;i < oddnumber.length;i++)
	    {
	      String ssodd = (numberrd == oddnumber[i]) ? a : b;
	      String sseven =(numberrd == evennumber[i]) ? a : b;
	      
	      if (oddeven.toUpperCase().equals("ODD"))
	      {
	        System.out.println(ssodd);            
	        
	      }else 
	        {System.out.println(sseven);
	        }
	      }
	    }
	    
	    
	    // }
	    // while(true);
	    
	    
	  }
