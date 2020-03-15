We keep track of the words from the magazine, mapping the word to its count. Creating the map takes `O(n)` time.

Next we go through the words in the note array, anytime we cannot find the word in the map, we know that creating the note is not possible and print `"No"`, while breaking out of the method. If the map does contain the word, we decrement the count of the word, removing it when counter hits 0. This loop takes `O(n)` time maximum, since maximum number of iterations is using every single word in the map.

Otherwise, we would be able to go through the entire array of words from the note, so we print `"Yes"`.
