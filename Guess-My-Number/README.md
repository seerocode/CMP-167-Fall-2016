#Guess My Number
This program is written in Java and is part of a homework assignment with some extra credit I threw in voluntarily. :)
The task was to write a program that asks the user for input (a nunber guess) and using the Random class, returns a random number as the computer's guess. The user's guess, computer's guess, and the difference between the two is output to the user.
I thought this was the perfect opportunity to learn how to do a loop to iterate each time the user made an incorrect guess. I did so with an if/else if statement in a do/while loop so only when the user guesses correctly will the program stop. 

Also, I did not use format strings in the if/else if statement because it would have been too many strings on the same line. I used println() instead and some \n escapes to get to new lines. The code works perfectly and looks great too.

(P.S. The comments are mostly for myself so I can remember why I did what I did. This many comments is not necessary in production environments.)

###Used:
* Scanner class
* Random class
* format strings and specifiers
* String concatenation
* if/else if statement
* do/while loop

##Issues
10/2/16
While running the first iteration of my code, I noticed that entering in the same guess for each re-try returned the same random number. 

This is what happened when I guessed 5 two times:

```java
	I am thinking of a number between 1 and 100 (including both). Can you guess what it is?
	Type a number: 
	5
	Your guess is: 5
	Too low! The number I was thinking of is: 45
	You were off by: 40
	Let's try again!

	I am thinking of a number between 1 and 100 (including both). Can you guess what it is?
	Type a number: 
	5
	Your guess is: 5
	Too low! The number I was thinking of is: 45
	You were off by: 40
	Let's try again!

	I am thinking of a number between 1 and 100 (including both). Can you guess what it is?
	Type a number: 
```

Thanks to my professor, I realized that my issue was the random number being assigned outside of the do/while loop instead of inside which meant it would give me a random number and repeatedly use that random number for the same guess. Same thing would happen if I guessed any other number multiples times: a random number would be assigned to that guess and would keep it in the loop and not return a different random number.

To fix this, I needed to do the same thing I did with the userGuess variable: declare "number" outside of the loop and assign it inside of the loop so it can be called anywhere. This is why understanding when to and when not to use same line assignments is important! 

I'm sure for a simple program and probably for final variables, same line is just fine. 

Anyway, this is what the output looks like now:

```java
	I am thinking of a number between 1 and 100 (including both). Can you guess what it is?
	Type a number: 
	5
	Your guess is: 5
	Too low! The number I was thinking of is: 54
	You were off by: 49
	Let's try again!

	I am thinking of a number between 1 and 100 (including both). Can you guess what it is?
	Type a number: 
	5
	Your guess is: 5
	Too low! The number I was thinking of is: 76
	You were off by: 71
	Let's try again!

	I am thinking of a number between 1 and 100 (including both). Can you guess what it is?
	Type a number: 
```