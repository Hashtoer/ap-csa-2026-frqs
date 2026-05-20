# Question 4: 2D Arrays

## My Approach

For this question, I created a sum variable to keep track of the total points in the target row. I also created a boolean called sameColor and set it to true at first.

I stored the color of the first space in the row, then looped through the rest of the row. During the loop, I added each space points to sum and checked if its color matched the first color. If any color was different, I changed sameColor to false.

At the end, if sameColor was still true, I returned double the sum. Otherwise, I returned the normal sum.

## What Gave Me Trouble

The main thing to remember was that board is a 2D array, so I had to use board[targetRow][i] to access each space in the target row.

I also had to remember to compare Strings using .equals() instead of ==. The problem says to double the sum only if all spaces in the row have the same color.

## What I Would Do Differently

I would make sure to clearly separate the two jobs of the loop: adding the points and checking the colors. This makes the code easier to read and helps avoid mistakes.

## Key Skills Needed

2D array traversal
Accessing row and column indexes
Calling object methods
Comparing Strings with .equals()
Using a boolean flag
Accumulating a sum
Conditional return values

## Course Connection

This connects to the parking lot project we worked on, as this deals with traversing and going through a 2D array.

