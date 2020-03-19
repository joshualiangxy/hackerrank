We map each character of the strings to its count using a HashMap, this takes O(l) time, where l is the length of the longer string.

We then initialize an integer representing the deletes.

For each character in the maps, we check if the other map contains the same character. If it does, we calculate the difference in the counts of the characters and add it to the delete count. Otherwise, this means that the other string does not contain this character, we take the count and add it to the delete count.