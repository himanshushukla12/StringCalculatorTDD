# String Calculator TDD Kata

## Introduction

This String Calculator TDD (Test-Driven Development) Kata aims to help you practice TDD by building a simple String calculator with the following requirements:

- The calculator has a method signature: `int Add(string numbers)`
- It can take up to two numbers, separated by commas, and will return their sum.
- For an empty string input, it will return 0.

## Requirements

1. Start with the simplest test case of an empty string and move to one and two numbers.
2. Solve things as simply as possible to force yourself to write tests you did not think about.
3. Refactor after each passing test.
4. Allow the `Add` method to handle an unknown amount of numbers.
5. Allow the `Add` method to handle new lines between numbers (instead of commas).

   - The following input is ok: "1\n2,3" (will equal 6)
   - The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)

6. Support different delimiters.

   - To change a delimiter, the beginning of the string will contain a separate line that looks like this: `//[delimiter]\n[numbers…]` for example `//;\n1;2` should return three where the default delimiter is ";".
   - The first line is optional. All existing scenarios should still be supported.

7. Calling `Add` with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.

   - If there are multiple negatives, show all of them in the exception message.

## Getting Started

To start the String Calculator TDD Kata, follow these steps:

1. Clone the repository: `git clone [repository_url]`
2. Navigate to the project directory: `cd [project_directory]`
3. Open the project in your preferred development environment.
4. Write tests for each requirement and implement the corresponding functionality in the `Add` method.

## Examples

```csharp
// Sample usage of the Add method
int result = Add("");       // Returns 0
int result = Add("1");      // Returns 1
int result = Add("1,2");    // Returns 3
int result = Add("1\n2,3");  // Returns 6
int result = Add("//;\n1;2"); // Returns 3
