Instead of checking every divisor from 2 to n for the number n, we check numbers from 1 to `sqrt(n)`.

The reasoning for this is that lets say we have a number `100`:

`100 = 2 * 50`

`100 = 4 * 25`

`100 = 5 * 20`

`100 = 10 * 10`

`100 = 20 * 5`

`100 = 25 * 4`

`100 = 50 * 2`

Notice how the numbers are on the opposite sides on after `sqrt(100) = 10`
