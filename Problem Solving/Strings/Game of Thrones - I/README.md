One property of palindromes is that when every character in the string must have either occured twice, or it is the middle element of a string of odd length.

I used a set and placed characters in if they do not exist in the set, and take the characters out if they can be found in the set.

This means that every even character will not appear in the set, so a valid palindrome would give us a set of at most size 1.
