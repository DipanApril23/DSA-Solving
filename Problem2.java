class Problem2{
	public static int firstMissingPositive(int[] arr){
		int n = arr.length;
		boolean contains = false;
		
		for(int i = 0; i<n; i++){
			if(arr[i] == 1){
				contains = true;
			}
			
			if(arr[i] <= 0 || arr[i] > n){
				arr[i] = 1;
			}
		}
		
		if(contains == false) return 1;
		
		for(int i = 0; i<n; i++){
			int num = Math.abs(arr[i]);
			int idx = num-1;
			
			if(arr[idx] < 0) continue;
			arr[idx] *= -1;
		}
		
		for(int i = 0; i<n; i++){
			if(arr[i] > 0){
				return i+1;
			}
		}
		
		return n+1;
	}
	
	public static void main(String[] args){
		int arr[] = {7,8,9,11,12};
		int result = firstMissingPositive(arr);
		
		System.out.println("First Missing Positive is: "+result);
	}
}
