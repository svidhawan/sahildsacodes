class Solution {
    public int findCircleNum(int[][] isConnected) {
        int cities= isConnected.length;
        int answer=0;
        boolean visited[] = new boolean[cities]; 
        for(int currentCity=0; currentCity<cities;currentCity++)
        {
            if(visited[currentCity])
            {
                continue;
            }
            else
            {
                answer++;
                dfs(isConnected,currentCity,cities,visited);
                
            }
        }
        return answer;
    }
    
    private void dfs(int [][] isConnected,int currentCity,int cities,boolean visited [])
    {
        if(visited[currentCity])
        {
            return;
        }
        
        visited[currentCity]= true;
        int[] neighbours = isConnected[currentCity];
        for(int i=0; i<cities; i++)
        {
            if (neighbours[i]==1)
            {
                dfs(isConnected,i,cities,visited);
            }
        }
        return;
    }
}