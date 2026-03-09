const readline = require('readline');

// Function to add two numbers
function addNumbers(a, b) {
  return a + b;
}

// Create a readline interface for user input
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Prompt user for input
console.log("Simple Addition Program");
rl.question('Enter the first number: ', (firstInput) => {
  const num1 = parseFloat(firstInput);

  // Check if the first input is a valid number
  if (isNaN(num1)) {
    console.log('Invalid input. Please enter a valid number.');
    rl.close();
    return;
  }

  rl.question('Enter the second number: ', (secondInput) => {
    const num2 = parseFloat(secondInput);

    // Check if the second input is a valid number
    if (isNaN(num2)) {
      console.log('Invalid input. Please enter a valid number.');
      rl.close();
      return;
    }

    // Compute and display the result
    const result = addNumbers(num1, num2);
    console.log(`\nThe sum of ${num1} and ${num2} is: ${result}`);

    rl.close();
  });
});