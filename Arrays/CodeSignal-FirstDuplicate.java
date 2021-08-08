/* https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/

Given an array of integers, find the first repeating element in it. 
We need to find the element that occurs more than once and whose index 
of first occurrence is smallest. 

Lesson Learned: 
-Hash Table is good for linear lookup
-All information is in the problem for a reason

Method 1: Brute Force
-Two pointers method. Loop through array twice. First to go through every 
element, second to check if there is a duplicate of given element.

Not ideal because of O(n^2) time complexity.

Method 2: Hash Table
-Create hash table. Keys in hash table are numbers in array, value is how many
times that number occurs. Go through loop a second time to see which is the
first number to have a duplicate value. 2 * 0(n) time complexity = 0(n)

hashmap<Integer, Integer> hash = new hashmap<Integer, Integer>

for (int i = 0; i < array.length; i++){
    hash.put(array[i], hash.get(array[i])+1);
}

for (int j = 0, j < array.length; j++{
    if hash.get(array[j] > 1){
        return j;
    }
}

return -1;

*/