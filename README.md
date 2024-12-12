### Ex1 Class:
The Ex1 class helps you work with numbers in base 2 to base 16 and convert them from their string format to int format and vice versa.
the class also compares the numbers, does multiplictaion and addition between them and finds the largest number
## Methods:
# Method number2Int(String num):
takes a number written as a string and converts it to an integer/ if the number is invalid then returns -1.
# Method isNumber(String a):
checks whether a string represents a number in a valid format,only bases between 2-16



# Ex1 Class

The `Ex1` class provides functionality for working with numbers in bases ranging from 2 to 16. It includes methods for converting numbers between their string representation and integer format, performing arithmetic operations, comparing numbers, and finding the largest value.

## Features
- Convert numbers between string format and integer format.
- Support for bases 2 to 16.
- Validate number strings.
- Perform addition and multiplication of numbers.
- Compare numbers to find the largest.

## Methods

### `number2Int(String num)`
- **Description**: Converts a number written as a string into an integer.
- **Returns**:
  - The integer value if the string is valid.
  - `-1` if the string is invalid.

### `isString()`
(Details about this method are incomplete. Please provide more information.)

## Usage
Provide a brief example or code snippet demonstrating how to use the class.

```java
Ex1 ex1 = new Ex1();
// Example usage of number2Int
int result = ex1.number2Int("1010"); // Valid binary string
System.out.println(result); // Outputs: 10
