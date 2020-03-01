My initial thoughts is that this is a recursion problem, where I check the 3 cases:

1. Going forward by `leap` amount

2. Going forward by one

3. Going backwards by one


My 2 base cases:

If my position after moving is off the array to the right, then I have won the game and thus return true.

Else if my position is either off the array to the left, or I have already visited this position, or the value of this position is not 0, then I return a false.

I then check on the 3 cases while remembering the places I have visited until I reach a win condition or I have visited every position and none work.
