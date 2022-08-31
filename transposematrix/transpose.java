package transposematrix;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[][]=new int[3][3];    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter matrix elments :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				input[i][j]=s.nextInt();
			}
		}
	    
		int transpose[][]=new int[3][3];  
		    
		System.out.println("Input matrix :");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(input[i][j]+" ");    
		}    
		System.out.println();//new line    
		}
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			transpose[i][j]=input[j][i];  
			}    
			}    
			  
		System.out.println("Transposed matrix :");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();
		}    

	}

}
