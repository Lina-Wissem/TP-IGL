import java.util.Arrays;

public class VectorHelper {
	
     public void Somme (int vect1 [], int vect2 [] , int somme[]) throws DifferenceException 
     {
    	 int i=0;
    	 if (vect1.length != vect2.length ) throw new DifferenceException() ;
    	 else 
    	 {
            while (i <= vect1.length)
            {
    		 somme[i]=vect1[i] + vect2[i];
    		 i++;
            }
    	 }
     }
     
//________________________________________________________________________
     
     public void Tri (int vect1 [] )
     {
    	 boolean verif = true;
    	 int i=0 , sauve;
    	 
    	 while (verif == true )
    	 {
    		for (i=0 ;i< vect1.length; i++)
    		{
    		 if ( vect1[i] > vect1[i+1] )
    		   {
    			 sauve = vect1[i];
    			 vect1[i] = vect1[i+1];
    			 vect1[i+1]= sauve;
    			 verif= true;
    		   }
    		 else 
    		  {
    			verif = false; 
    		  }
    		
    	    }
    	 }
    		
     }
     
 //__________________________________________________________________________________
     
     public void MaxMin (int vect1[], int max, int min)
     {
    	 Tri(vect1);
    	 min=vect1[0];
    	 max=vect1[vect1.length];
    	 
     }
}
