# Orientation Task 3 (Writing)

## 1. Age distribution

**Question:** Suppose you are compiling statistics on the age structure of students in our group. You should then draw 1000 age values and these should be distributed in the same way as the age distribution of the students in the group. How do you do it? Explain the algorithm in enough details to be able to program it directly. Take an idea/model from the example on section `Your own distribution`.

**Answer:**

To simulate the age distribution of students in our group, I would follow the steps below:

#### 1. Collect data 

First, I will collect data on the age distribution of students in our group. After collecting, I would have a table of table of data that looks like this:

| Age       | Number of students | Percentage of students |
|-----------|--------------------|------------------------|
| 18-20     | 6                  | 23%                    |
| 21-25     | 7                  | 27%                    |
| 26-30     | 5                  | 19%                    |
| 31-35     | 4                  | 15%                    |
| 36-40     | 3                  | 12%                    |
| Above 40  | 1                  | 4%                     |
| **Total** | **26**             | **100%**               |

#### 2. Calculate cumulative percentage

Next, I will calculate the cumulative percentage of each age group.

| Age       | Number of students | Percentage | Cumulative percentage |
|-----------|--------------------|------------|-----------------------|
| 18-20     | 6                  | 23%        | 23%                   | 
| 21-25     | 7                  | 27%        | 50%                   |
| 26-30     | 5                  | 19%        | 69%                   |
| 31-35     | 4                  | 15%        | 84%                   |
| 36-40     | 3                  | 12%        | 96%                   |
| Above 40  | 1                  | 4%         | 100%                  |
| **Total** | **26**             | **100%**   | **100%**              |

#### 3. Generate random number

Then, I will generate a random number between 1 and 100. This random number will be used to determine which age group the student will be in.

#### 4. Determine age group

Next, I will use the random number generated in the previous step to determine which age group the student will be in. This is done by comparing the random number to the cumulative percentage of each age group. If the random number is less than the cumulative percentage of the age group, then the student will be in that age group. Otherwise, the student will be in the next age group.

- If the random number falls between 1 and 23, assign the age between 18 and 20.
- If the random number falls between 24 and 50, assign the age between 21 and 25.
- If the random number falls between 51 and 69, assign the age between 26 and 30.
- If the random number falls between 70 and 84, assign the age between 31 and 35.
- If the random number falls between 85 and 96, assign the age between 36 and 40.
- If the random number falls between 97 and 100, assign the age above 40.

This process is repeated until 1000 students are assigned an age based on the distribution.



## 3. Singleton

**Question:** Why can't a Singleton object be created from outside the Singleton class using the new operation?

**Answer:**

A Singleton object can't be created from outside the Singleton class using the new operation because the constructor of the Singleton class is private. This means that the Singleton class can't be instantiated from outside the class. The only way to create an instance of the Singleton class is to call the static method `getInstance()` which returns the instance of the Singleton class. This method is called a factory method because it is responsible for creating an instance of the Singleton class.



## 4. Distributions

**Question:** Familiarize yourself with a few distributions that could be used in the simulator for experimentation. These distributions could be used in the following situations. Find answers online. You can also study other distributions. For example, Google "real life example of normal distribution"

**Answer:**

**1. Normal Distribution:**

- Use case: The Normal Distribution, also known as the Gaussian distribution, is used in statistics as a simple model for complex random variables. 

- Example: A real-life example of a normal distribution is human height. If you collected the heights of all adults in a region, the data would be distributed in a bell curve shape, which is characteristic of the normal distribution.

**2. Poisson Distribution:**

- Use case: The Poisson Distribution expresses the probability of a given number of events occurring in a fixed interval of time or space.

- Example: A real-life example of a Poisson distribution is the number of phone calls received by a call center per hour.

**3. Binomial Distribution:**

- Use case: The Binomial Distribution describes the number of successes in a fixed number of independent Bernoulli trials with the same probability of success.

- Example: A real-life example of a binomial distribution is the number of heads in 10 coin flips.

**4. Exponential Distribution:**

- Use case: The Exponential Distribution describes the time between events in a Poisson point process.

- Example: A real-life example of an exponential distribution is the amount of time until the next bus arrives.

**5. Uniform Distribution:**

- Use case: The Uniform Distribution describes an event where every outcome is equally likely.

- Example: A real-life example of a uniform distribution is rolling a single die. Each outcome (1, 2, 3, 4, 5, 6) is equally likely.