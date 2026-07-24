class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Integer[] ue=mp.keySet().toArray(new Integer[0]);

        Arrays.sort(ue,(a,b)->mp.get(b)-mp.get(a));

        int[] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=ue[i];

        }
        return res;
    }
}
