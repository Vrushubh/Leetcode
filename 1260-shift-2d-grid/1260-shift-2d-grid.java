class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k %= grid.length * grid[0].length;
        int org[] = new int[grid.length * grid[0].length];
        int f=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                org[f]=grid[i][j];
                f++;
            }
        }
        int fin[] = new int[grid.length * grid[0].length];
        int x = (grid.length * grid[0].length) - k;
        for(int i=0;i<fin.length;i++){
            if(x==fin.length) x=0;
            fin[i]=org[x];
            x++;
        }
        f=0;
        List<List<Integer>> gri = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                row.add(fin[f++]);
            }
            gri.add(row);
        }
        return gri;
    }
}