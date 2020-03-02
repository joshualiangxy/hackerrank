Interesting problem to introduce the Stack data structure.

We simply push each opening bracket into the stack, and when we encounter a closing bracket, if the top element of the stack is a corresponding opening bracket, we pop it out.

If we are able to go through the entire string without issues and have an empty stack at the end, we know that the parentheses string is balanced.
