class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int count = 0;
        int i = -1;
        int sum = 0;
        mp.put(0, 1);
        
        while(i < arr.length-1){
            i++;
            sum += arr[i];
            
            if(mp.containsKey(sum)){
                count += mp.get(sum);
                mp.put(sum, mp.get(sum) + 1);
            } else {
                mp.put(sum, 1);
            }
        }
        
        return count;
    }
}
