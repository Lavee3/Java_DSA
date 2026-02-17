

Step 1:
Store size of array
int n = nums.length;

Step 2:
If only one element, return it
if(n == 1)
return nums[0];

Step 3:
Sort the array
Arrays.sort(nums);

Step 4:
Initialize variables
freq = 1
sol = nums[0]

Step 5:
Traverse array from index 1 to n-1
for(int i=1; i<n; i++)

Step 6:
If current element same as previous
freq++

Step 7:
If different element
freq = 1
sol = nums[i]

Step 8:
If freq becomes greater than n/2
return sol

Step 9:
If not found, return middle element
return nums[n/2]


