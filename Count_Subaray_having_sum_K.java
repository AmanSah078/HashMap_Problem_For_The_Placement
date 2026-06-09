class Count_Subaray_having_sum_K{
	static void subarrayhavingsumk(int[]arr, int k)
	{
		//Create HashMap
		//Hashmap<Integer,Integer> map = new Hashmap<>;
		HashMap<Integer,Integer> map = new HashMap<>();
	//now first intially intialize the map.put=0,1
		map.put(0,1);
		int sum=0;
		int count=0;
		//loop
		for(int i=0; i<arr.length; i++)
		{
		sum=sum+arr[i];
		int req=sum-k;
		if(map.containsKey(req)) //it means kya req ka eleement use hua hain as a                              key in the map or not 
			{
	count=count+map.get(req); //It means map.get(req) i want the value of the req key
			}
	  map.put(sum,1);
			}
		
		System.out.println(count);

	}
	public static void main(String[] args)
	{
		int[] arr={9,4,20,3,10,5};
		subarrayhavingsumk(arr,33);
	}
}