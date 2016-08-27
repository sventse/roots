import java.io.IOException;

public class findRoots {
	 public static void main (String [] args) throws IOException {
		 double x = 1;
		 double y = 2312;
		 while(y>0.01||y<-0.01){
			 double slope = derivative(x);
			 y = function(x);
			 if(y>0){
				 x-=y/slope;
			 }
			 else{
				 x+=y/slope;
			 }
		 }
		 System.out.println(x);
	 }
	 public static double function(double x){
		 return (x-2)*(x+2)+2*x;
	 }
	 public static double derivative(double x){
		 return 2*x+2;
	 }
}
