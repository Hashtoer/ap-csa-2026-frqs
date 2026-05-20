## Question 2: Class Design

## My Approach

I created two instance variables: capacity to store the bottle’s maximum amount and current to store the amount currently left. In the constructor, I set both equal to the parameter because the bottle starts full.

In updateAmount, I subtracted the liquid used from current. Then, if current was less than 25% of the capacity, I reset it back to full capacity. Finally, I returned current.

## What Gave Me Trouble

The main thing to watch was the 25% condition. I had to compare current to capacity * .25. Also, the bottle resets only when it is less than 25%, not equal to 25%. The sample table shows this with the 40 mL bottle example.

## What I Would Do Differently

I would use clearer variable names. Instead of c, I could use bottleCapacity, and instead of liquid, I could use amountRemoved.

## Key Skills Needed
Writing a complete class
Instance variables
Constructors
double values
Conditionals
Updating object state
Returning values
Course Connection

## Connection to Course
This connects to the confetti project we did as it involves creating a class and working with object oriented programming. 
