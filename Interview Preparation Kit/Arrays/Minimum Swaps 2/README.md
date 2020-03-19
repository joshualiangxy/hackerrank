This problem needed some thinking.

Knowing that each element `i` from 1 to n when sorted will end up at position `i - 1` after sorting, I decided that to check each element in the array, if it is not in position, we swap it to it's position `i - 1`.

We do this for every element, and this should give us the minimum number of swaps.

Let's try this on what I believe to be the worst case scenario.

1. `[6, 1, 2, 3, 4, 5]`
2. `[5, 1, 2, 3, 4, 6]`
3. `[4, 1, 2, 3, 5, 6]`
4. `[3, 1, 2, 4, 5, 6]`
5. `[2, 1, 3, 4, 5, 6]`
6. `[1, 2, 3, 4, 5, 6]`

The invariant for our algorithm here is that in the i-th iteration, we have i elements in their proper positions. For an unsorted array in our example, this is the best case scenario for bubblesort, and this will still take minimum of n swaps.
