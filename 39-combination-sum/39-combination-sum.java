class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getcombi(ans,new ArrayList<>(),candidates,target,0);
        return ans;
    }
    
    private void getcombi( List<List<Integer>> ans, ArrayList<Integer> results,int nums[],int target,int currentIndex)
    {
        if(target==0)
        {
            ans.add(new ArrayList<Integer>(results));
            return;
        }
        
        if(currentIndex>=nums.length)
        {
            return;
        }
        
        if(nums[currentIndex]<=target)
        {
        results.add(nums[currentIndex]);
        getcombi(ans,results,nums,target-nums[currentIndex],currentIndex); 
        results.remove(results.size()-1);
        }
        getcombi(ans,results,nums,target,currentIndex+1);

        
        return;
        
    }
}