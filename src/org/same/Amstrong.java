package org.same;

public class Amstrong {
   public static void main(String[] args) {
	    for(int n=2;n<=1000;n++) {
	    	int i=0,j=0;
	    	int a=n;
	    	while(a>0) {
	    		i=a%10;
	    		j=(i*i*i)+j;
	    		a=a/10;
	    	
	    }
	    	if(a==j) {
	    		System.out.println(n);
	    	}
	    }   
}
}
   