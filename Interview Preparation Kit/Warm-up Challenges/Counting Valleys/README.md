We can update the height for each character in the string, so if the current character is 'D', we decrement height, if current character is 'U', we increment height.

Doing so, if we are not in a valley and the next step we take causes height to go below 0, this means that we are entering a valley and thus we increment the valley count.
