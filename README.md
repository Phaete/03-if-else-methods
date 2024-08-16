# 03-If-Else Methods

## If-Else

### If Statements

If statements are used for conditional branching:
- if [...], then [...]

Keyword: _if_ \
\
Syntax:
```java
if (condition) {
    [...]; // Code for true condition
}
```
### Simplifying Conditions:
Let x be a boolean: `boolean x`

- (x == true) simplifies to (x) if `x = true`
- (x == false) simplifies to (!x) if `x = false`


### If-Else Statements
- if […], then […], else […]

Keywords: _if_, _else_ \
\
Syntax: 
```java
if (condition) {
    [...]; // Code for true condition
} else { 
    [...]; // Code for false condition
}
```
In both cases: \
The condition must be of type _boolean_!

### Nesting
Nesting involves nesting if or if-else statements within each other.

Example:
```java
if (condition1) {
    if (condition2) {
        if (condition3) {
            [...]; // Code for true condition
        } else { 
            [...]; // Code for false condition
        }
    } else {
        [...]; // Code for false condition
    }
} else {
    if (condition4) {
        [...]; // Code for true condition
    } else { 
        [...]; // Code for false condition
    }
```

# Methods
We’ve already encountered the first method: _main_ \

### Methodensignatur
`public` `static` `void` `main` `(String[] args)` {}
- `public`: Access modifier. Specifies who can use this method. More on this later.
- `static`: More on this later.
- `void`: Return type. Void means no return value.
- `main`: Method name, following camelCase convention.
- `(String[] args)`: Parameters passed to the method.

Methods are used to encapsulate code and can be reused at different points in the code (_reusability_).

## Scope

Scope refers to the region where a variable is accessible.
A variable is available in the current block and any nested blocks, but not beyond:
```java
if (condition1) {
    if (condition2) {
        int number = 5;
        if (condition3) {
            int a = 10;
            boolean aGreaterNumber = a > number; // Allowed
        } 
    } else {
        int sum = 2 + number; // Not allowed
    }
}
```

## Rückgabe

The return type is defined in the method signature: 
`public static void main() {}` -> **void**

Keywords: _return_ \
\
Example:
```
public static int getInteger() {
    return 5;
}
```
When calling the method, it returns the integer value _5_:
```
int test = getInteger(); // test = 5
```
\
If no assignment occurs, the return value is discarded or ignored:
```
getInteger(); // No assignment, return value is ignored
```

## Parameters / Arguments

By modifying the method signature, you can define parameters or arguments for a method:
```
public static void isLivingOnEarth(boolean livingOnEarth, int age){}
```
In this example, the defined arguments are:
- boolean livingOnEarth
- int age 

Both are accessible within the method using their respective variable names and **must be passed in the correct order** when calling the method:
```
isLivingOnEarth(true, 18);
```
