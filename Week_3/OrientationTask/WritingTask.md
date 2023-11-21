# Orientation Task 3 (Writing)

## 1. Age distribution

**Question:** Suppose you are compiling statistics on the age structure of students in our group. You should then draw 1000 age values and these should be distributed in the same way as the age distribution of the students in the group. How do you do it? Explain the algorithm in enough details to be able to program it directly. Take an idea/model from the example on section `Your own distribution`.

**Answer:**

To simulate the age distribution of students in our group, I followed the steps below:

### 1. Collect data 

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

### 2. Calculate cumulative percentage

Next, I will calculate the cumulative percentage of each age group.

| Age       | Number of students | Percentage | Cumulative percentage |      |
|-----------|--------------------|------------|-----------------------|------|
| 18-20     | 6                  | 23%        | 23%                   | 0.23 | 
| 21-25     | 7                  | 27%        | 50%                   | 0.50 |
| 26-30     | 5                  | 19%        | 69%                   | 0.69 |
| 31-35     | 4                  | 15%        | 84%                   | 0.84 |
| 36-40     | 3                  | 12%        | 96%                   | 0.96 |
| Above 40  | 1                  | 4%         | 100%                  | 1.00 |
| **Total** | **26**             | **100%**   | **100%**              | 1.00 |

### 3. Generate random number

Then, I will generate a random number between 0 and 1. This random number will be used to determine which age group the student will be in.

### 4. Determine age group

Next, I will use the random number generated in the previous step to determine which age group the student will be in. This is done by comparing the random number to the cumulative percentage of each age group. If the random number is less than the cumulative percentage of the age group, then the student will be in that age group. Otherwise, the student will be in the next age group.

- If the random number falls between 0 and 0.23, assign the age between 18 and 20.
- If the random number falls between 0.24 and 0.50, assign the age between 21 and 25.
- If the random number falls between 0.51 and 0.69, assign the age between 26 and 30.
- If the random number falls between 0.70 and 0.84, assign the age between 31 and 35.
- If the random number falls between 0.85 and 0.96, assign the age between 36 and 40.
- If the random number falls between 0.97 and 1.00, assign the age above 40.

This process is repeated until 1000 students are assigned an age based on the distribution.



## 3. Singleton

**Question:** Why can't a Singleton object be created from outside the Singleton class using the new operation?

**Answer:**

A Singleton object can't be created from outside the Singleton class using the new operation because the constructor of the Singleton class is private. This means that the Singleton class can't be instantiated from outside the class. The only way to create an instance of the Singleton class is to call the static method `getInstance()` which returns the instance of the Singleton class. This method is called a factory method because it is responsible for creating an instance of the Singleton class.

