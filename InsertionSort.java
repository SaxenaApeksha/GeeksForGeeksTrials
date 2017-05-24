
public class InsertionSort {

	public static void main(String[] args) {
		
		int []input = {2,5,3,4,1};
		
		for(int i=1;i<input.length;i++){
			for(int j=i;j>0;j--){
				if(input[j]<input[j-1]){
					int temp=input[j];
					input[j]=input[j-1];
					input[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
}
