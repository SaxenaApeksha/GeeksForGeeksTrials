
public class BubbleSort {
public static void main(String[] args) {
	
	int[] input ={00,2,3,1,32,12,45};
	int n= input.length;
	for(int i=0;i<n-1;i++){
		for(int j=0;j<n-1-i;j++){
			if(input[j]>input[j+1]){
				int temp = input[j];
				input[j]=input[j+1];
				input[j+1]=temp;
			}
		}
	}
	
	for(int i=0;i<n;i++){
		System.out.println(input[i]);
	}
}
}
