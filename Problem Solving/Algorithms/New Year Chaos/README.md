This was a rough question for me.

My initial thoughts was to use bubblesort, but I was concerned about the time complexity on that.

2 things to note:

1. Since we were looking for the minimum bribes necessary, we do not need to care about position swapping that would make things confusing, such as position 1 and position 2 swapping with each other multiple times.

2. Bribing will only move your position in front of the people you have bribed, so we can look at the people who have accepted bribes instead, the people with larger numbers in front of them.

The first thing to do is to check the position for each element, if it was more than 2 positions in front of it's original, we break the loop and print out `"Too chaotic"`

Next, we loop from the earliest possible location for the specific element e we are looking at (and that is 2 positions in front of it's original position) to its current location, and we check this subset of elements for the people who have bribed our current element e (ie its value is greater than the value of element e). We increment the counter accordingly.
