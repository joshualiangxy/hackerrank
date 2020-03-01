My first thoughts on this question is that I could simply calculate the number of occurrences of 'a' in the original non-repeating string s, and then multiply that number by the number of times this string s can fit into the integer n.
Next, I need to find the number of occurrences in the substring of s that I cannot fit into n.

So let's say `s = 'abc'`, and I want to find the number of occurrences of 'a' in the first 200 letters. 
'a' occurs 1 time in string s, and we can fit 66 of string s into 200 characters, so the answer to that would be `1 * 66 = 66` occurrences of 'a'. 
However, there is still 2 more characters leftover, as string s of length 3 multiplied by 66 times is only 198 characters, so we have 2 characters leftover. 
Now we look into the substring of s containing the first 2 characters. 'a' occurs once there, so the number we return is:
`66 + 1 = 67`
