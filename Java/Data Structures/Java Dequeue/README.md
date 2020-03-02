Not very sure what is going on with this problem, since I don't really feel like it properly introduces the Dequeue data structure.

We use a HashMap that maps the integers in the subarray to the count of the integers in the subarray. We use the deque to keep track of the elements in our subarray.

Since there is no overlapping keys in the hashmap, we simply check the size of the hashmap to find the amount of unique numbers in each subarray.

Each time we push an element into the deque, we check if the map contains the element already. If it does, we increment the counter. Otherwise, we add the element into the map as a key with counter 1.

Each time we pop an element out of the deque, we check the counter of the element in the map. If it is at 1, we remove the key from the map. Otherwise, we decrement the counter.

I did not enjoy doing this problem. It did not display the uses of a deque properly and the class name was not in PascalCase, which tilts me.
