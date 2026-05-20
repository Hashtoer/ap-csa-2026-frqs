# Question 3: ArrayLists and Searching

## My Approach

For this question, I used nested for loops to compare every student in historyList with every student in mathList. I stored the history student’s ID in a String variable called name, then checked if any math student had the same ID.

If the IDs matched, I compared their absences. If the student had more absences in history than in math, I increased count by 1. At the end, I returned count.

## What Gave Me Trouble

The main thing that gave me trouble was remembering how to access objects in an ArrayList. I originally mixed up array syntax with ArrayList syntax, using brackets instead of .get(index).

I also had to be careful with the exact method names, like getStudentID() and getAbsences(), since Java is case-sensitive. The problem gives these methods in the CourseRecord class.

## What I Would Do Differently

I would slow down and carefully check whether the data structure is an array or an ArrayList. I would also make sure I copied method names exactly from the problem before writing the code.

## Key Skills Needed

- Nested loops
- ArrayList traversal
- Using .get(index)
- Calling object methods
- Comparing Strings with .equals()
- Counting matches
- Boolean conditions

## Course Connection

This connects to the candy bar project we did we both of them deal with making an Arraylist with objects and having helper methods to get certain properties of each object.
