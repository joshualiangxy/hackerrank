This is a pretty straightforward question.

Given an array `[0 0 1 0 0 1 0]`, where 0 represents the index of the array we can move to and 1 representing the indexes we cannot move to, we simply try to take the larger step first. If that fails, we take the smaller step. Repeat until we reach the end of the array.
