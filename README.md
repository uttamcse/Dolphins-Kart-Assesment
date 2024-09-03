
 # Dice Roll Parser and Evaluator
 * ==============================
 * A Java application to evaluate dice roll expressions and output the results in JSON format.

 
 
 # Description
 * -----------
 * This application reads a file of dice roll expressions, evaluates them,
 * and outputs the results in JSON format, including the result of each roll,
 * as well as the minimum and maximum possible outcomes.



   # Table of Contents
 * -----------------
 * 1. Features
 * 2. Requirements
 * 3. Installation
 * 4. Usage
 * 5. Input Format
 * 6. Output Format
 * 7. Testing
 * 8. Contributing
 * 9. License
 * 10. Contact
 
 # Features
 * --------
 * - Parses various dice roll expressions.
 * - Outputs JSON with the computed roll result, minimum possible result, and maximum possible result.
 
 # Requirements
 * ------------
 * - Java Development Kit (JDK) 11 or higher
 * - Maven or Gradle for dependency management and build process
 * - Unix-like system (Linux, macOS, WSL2 on Windows)
 
 # Installation
 * ------------
 * Step 1: Clone the Repository
 * ----------------------------
 * git clone : https://github.com/uttamcse/Dolphins-Kart-Assesment.git
 * cd dice-roll-parser
 * 
 * Step 2: Build the Project
 * -------------------------
 * Using Maven:
 * mvn clean install
 * 
 * Using Gradle:
 * gradle build
  
 # Usage
 * -----
 * Run the program by providing the input file as the first argument.
 * Optionally, specify an output file as the second argument.
 * 
 * java -jar target/dice-roll-parser.jar input.txt
 * 
 * Optionally, specify an output file:
 * java -jar target/dice-roll-parser.jar input.txt output.json


   # Project Structure
dice-roller/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── diceroller/
│   │   │               ├── DiceRoller.java
│   │   │               └── DiceRollerParse.java
|   |   |               └── DiceRollerResult.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
├── input.txt              # Place your input.txt file here
├── output.json            # Output file (if specified)
├── pom.xml
└── README.md
 # Input Format
 * ------------
 * The input file should contain one dice roll expression per line, such as:
 * 
 * 2d6 + d8 + 4
 * D20 - 1 + 4d12
   
 # Output Format
 * -------------
 * The output JSON file will contain an array of objects, each representing
 * the evaluation of a dice roll expression.
 * 
 * Example output:
 * [
 *     {"roll-result": 15, "roll-min": 7, "roll-max": 20},
 *     {"roll-result": 35, "roll-min": 5, "roll-max": 81}
 * ]

 # Testing
 * -------
 * To test the application, create an input file with various dice roll expressions
 * and compare the program's output to expected results.
 
 # About me
  

 * Contact:7355268954
  
 * For any questions or issues, please contact uttamcseau@gmail.com.
 * LinkedIn: https://www.linkedin.com/in/uttam-yadav/
