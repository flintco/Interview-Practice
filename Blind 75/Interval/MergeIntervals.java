// 56. Merge Intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1){
            return intervals;
        }
        
        //Organize intervals
        Arrays.sort(intervals, (array1, array2) -> Integer.compare(array1[0], array2[0]));
        //for (int i = 0; i < intervals.length;i++){ System.out.println(i + ": " + intervals[i][0] + "," + intervals[i][1]);}
        
        ArrayList<int[]> finalIntervals = new ArrayList();
        int[] currentInterval = intervals[0];
        
        for(int[] interval: intervals){
            //System.out.print("CurrentInterval: " + currentInterval[0] + "," + currentInterval[1]+ "   Next Interval: " + interval[0]+","+interval[1]);
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            //overlap
            if(currentEnd >= nextStart){
                if(currentEnd < nextEnd){
                    currentInterval[1] = nextEnd;
                }
            } else{
                //no overlap
                finalIntervals.add(currentInterval);
                currentInterval = interval;
            }
        } 
        finalIntervals.add(currentInterval);
        
        return finalIntervals.toArray(new int[finalIntervals.size()][]);
    }
}

/* 
Description:

Step 1 Brute Force: Iterate through every set of intervals. At each iteration, compare to other intervals.
If the intervals overlap, merge them. 0(n^2).

Step 2 Sorting and Greedy: Sort the intervals by start time. Iterate through intervals and if it overlaps with
next interval, them combine with next interval. If it doesn't overlap, add to final. 0(nlogn)

Problem Link: https://leetcode.com/problems/merge-intervals/
Good explanation: https://www.youtube.com/watch?v=qKczfGUrFY4
*/