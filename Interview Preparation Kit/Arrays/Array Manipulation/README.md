Very tough problem for me. I had to learn new ways to use arrays (the prefix-sum array and difference array).

I first did through this problem as I usually would, by creating a regular array, updating every single element for each query, and then I took the max element of the array.
Doing it my way, I could pass most of the tests, but failed the large test cases, due to my inefficiency.

Calculating the time complexity, let's say each query updates an average of k entries, so the operation of updating entries is `O(k)`.

Let's say we have m queries, each update taking `O(k)` time, this would mean that all the queries would result in `O(mk)`.

In addition, we still have to find the maximum element in the array, so this would take `O(n)` time, but in the large test cases we are failing, most of the time we take should be in the queries and updating, so overall, `O(mk)` should be a good bound.



After learning about the prefix-sum array and difference array, I created a difference array instead and thus I only had to update the first and last element with each query. This lowers my complexity of updating to `O(1)`, and thus my query and updating is now `O(m)`.

And for finding the max, we will use a prefix-sum algorithm where each element is equal to the sum of the previous element and the current element in the difference array, so something like `prefixSumArray[i] = prefixSumArray[i - 1] + differenceArray[i]`. This whole operation takes `O(n)`.

This lowers our time complexity to `O(n + m)`
