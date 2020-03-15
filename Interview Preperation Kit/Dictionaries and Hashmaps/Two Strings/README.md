We first add the characters of both strings into a set. This operation takes `O(n)` time, where `n` is the length of the larger string.

Next, we go through every character in the alphabet. If either sets contains the same alphabet, we know there is a shared substring and we return `"YES"`.
This operation always takes constant time, which is the size of the alphabets.

Otherwise, if we do not find a shared alphabet, we return `"NO"`.
