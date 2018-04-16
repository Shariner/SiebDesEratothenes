import java.util.Arrays;
import java.util.Scanner;
public class SiebDesEratothenes {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximale Zahl (Maximum ist: "+Integer.MAX_VALUE+" :");
		int n = scan.nextInt();
		int j = 0;

		
		
		int[] era = new int [n];
		
		for(int i = 0; i<n;i++) {
		era[i] = i+1;
		}
		era[0] = 0;
		//System.out.println(Arrays.toString(era));
		do {
			for(int i=0; 0<era.length;i++) {
				if(era[i]>0) {
					j=i+1;
					break;
				}

			}
			era[j-1]*=-1;
			
			for(int y=2*j; y<=n; y+=j) {
				era[y-1] = 0;
			}
		}
		while(j*j<n);
		//System.out.println(Arrays.toString(era));
		
		int z = 0;
		for(int i=0; i<n; i++) {
			if(era[i] != 0) {
				z++;
				}
			}
				int[] prim = new int[z];	
				int k = 0;
				for(int i = 0; i<n; i++) {
					if(era[i]!=0) {
						prim[k] = i+1;
						k++;
						}
					}	
				
				System.out.println("Fertig: "+Arrays.toString(prim));
		}
		
	}

	
