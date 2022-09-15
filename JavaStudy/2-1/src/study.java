public class study {

	public static void main(String[] args) {
		getName("新原","克明");
		int[]arr= {11,12,13,14,15,16,17,18,19,20};
		for (int i = 0;i < arr.length;i++) {
			int num=arr[i];
			is0dd(num);
			
		}

	}
	public static void getName(String firstName,String lastName) {
		String fullName=firstName+lastName;
		System.out.println(fullName);
	}
			
	
	public static void is0dd(int num) {
		if (num%2!=0) {
			System.out.println(num+"は奇数です。");
			
		}
		
	}
	
		
	}


