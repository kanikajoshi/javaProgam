/**
 * 
 */
package JavaProgams;

public class primeNumber {


	public static void main(String[] args) {
		

		int flag = 0;

      for(int i=1;i<101;i++) {
			flag=0;
			for(int j = 2;j<=i;j++) {

				if(i!=j) {
					if(i%j==0){
						flag=1;
					}
				}

			}

			if(flag==0) {
				System.out.println(i+" "+"is prime number");
			}	
			else {
				System.out.println(i+" "+"is not prime number");
			}


		}

	}

}
