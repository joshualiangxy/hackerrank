I redid this question after learning about prefix sum arrays. The preprocessing really helps, I do suggest everyone to look up prefix sum and difference arrays.

Since we are using a prefix sum array, the total of the subarray from position i to position j can be calculated with just `total = arr[j] - arr[i - 1]`. This gives us an `O(1)` method of getting the total and we loop through every possible subarray, so that would be `n + (n - 1) + (n - 2) + ... + 2 + 1` loops which results in an `O(n^2)` solution (sum 1 to n = `n(n + 1) / 2`).
