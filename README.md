# lab3-bigO (100 pts)

Today we're going to be doing science!
![stand back](https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/9fbc94fa-3770-4723-9f85-ec7a61fb6cbe/d9i34zm-5284e852-53ac-4c16-b1cc-8e363e3bc4e5.png)

Specifically, we're going to make a hypothesis about what the runtime for a program is, track how long it takes to run given various sized inputs, and verify if our hypothesis are correct. 


## Review Big-O: 10pts
First, let's review the most common big-O notations. Spend some time as a group coming up with examples that might fit each type of big-O notation. Add them to your reflections.txt file. 
* Constant, O(1)
* Linear O(n)
* Quadratic O(n^2) 
* Exponential O(a^n), commonly O(2^n) 


## Make Hypotheses: 20 pts
Then, come up with big-O hypotheses for the following functions. Add them to your reflections.txt. Explain your reasoning for your hypothesis. 

* addNumbersOneThroughN_v1
* isEven
* addNumbersOneThroughN_v2
* guessPassword

## Calculate Runtime: 30 pts
Next, we want to set up how we're going to determine how long it takes code to run. One way to do this would be to use a wall clock and record the start/stop time, but that isn't very accureate. Our computers have a built in clock, so we'll use that instead. In Java, to get the current time in nanoseconds, you can use:

long startTime = System.nanoTime();

So if we want to calcualte the time it takes code to run, we will want to get the start Time before our code runs, and the end time after our code runs. Then the total run time is the difference between the start time and the stop time.

For n=10, 20,30,40,50,60,70,80,90,100,110,500 determine how long each function takes to run. 

---
**NOTE**

The first time the method runs, it might take significantly longer. This is due to details about java, which are outside the scope of the course. To get around this issue, we're running each method first with a value of n=0. 

If you are curious, this is because in Java, code can be lazily loaded on first reference which means the first time that code runs, the computer has to do extra work to get the method loaded before it can be run. This is why 
---

## Graph the Result: 40 pts (10 pts per method)
Finally, let's plot our points! To do so, use the following calculators.

[Linear/Constant](https://stats.blue/Stats_Suite/correlation_regression_calculator.html)

[Quadratic](https://stats.blue/Stats_Suite/polynomial_regression_calculator.html)

[Exponetial](https://stats.blue/Stats_Suite/exponential_regression_calculator.html)

These calculators will try and create a function that fits your data points the best. They will also provide an r-squared value. The r-squared value is a statistical measurement of how well the function fits your data and ranges from 0 to 1, with 0 being the worst, and 1 being the best. 

For each graph you generate, please download the jpeg(2pts) and add it to your github repository with an appropriate name. In reflections.txt, write the function produced by both calcaulators(2 pts), thier r-squared values(2 pts), and the big-O runtime of the function based off your graph(4 pts). Note that it's great if this doesn't match your hypothesis! An important part of science is learning from when your theories are incorrect. For bonus points, if you had an inccorrect hypothesis, what made you think it was that big-O notation? Why did that prove to not be the case?

## Going Further
There are many ways to solve a problem. Like we saw in AddNumbersOneThroughN, there are frequenty

