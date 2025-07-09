
public class List_03_17 {
	public static void main(String[] args) {
		/*int [][] scores1= new int [3][3];
		
	    scores1[0][0]=10;
	    scores1[1][0]=40;
	    scores1[2][0]=70;
	  
	    scores1[0][1]=20;
	    scores1[1][1]=50;
	    scores1[2][1]=80;
	    
	    
	    scores1[0][2]=30;
	    scores1[1][2]=60;
	    scores1[2][2]=90;*/
	    
	    int [][] scores2= {
	    		{10,20,30,},
	    		{40,50,60,},
	    		{70,80,90,}
	    };
	    
	    
	    /*for (int i=0; i<3;i++) {
	    	for(int x=0;x<3; x++) {
	  	  System.out.print(scores2[i][x] +" ");
	    }
	    	System.out.println(" ");	
	}*/
	    
	    
	    
	    //3
	    
	    for (int i=0; i<scores2.length;i++) {
	    	for(int x=0;x<scores2[i].length; x++) {
	  	  System.out.print(scores2[i][x] +" ");
	    }
	    	System.out.println(" ");	
	}

	}}


