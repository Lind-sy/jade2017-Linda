package lv.vea.fibonacci;
import java.util.Arrays;

public class FibonachiSeries {
		
	public static void main(String[] args){
		int[] myFib = getFibonacciSeries(6);
		System.out.println(Arrays.toString(myFib));
	}
	
	public static int[] getFibonacciSeries(int N){
		int[] fibonacci = new int[N];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for(int i=2;i<N; i++){
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2]; 
		}
		
		return fibonacci;  
	}	
	
}
