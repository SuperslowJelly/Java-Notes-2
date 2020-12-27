/*

    *** Day 3

    ### Math: Operators
    +, -, *, /, % (modulo) are all available for processing their correlated mathematical functions.
    Math.pow(base, exponent) returns the base to the power of the exponent.
    Math.floor(decimal) rounds down a decimal.
    Math.ceil(decimal) rounds up a decimal.
    Math in Java follows the PEMDAS order, e.g:
    (5 + 10) / 2 = 15 / 2 = 7.5
    (43 - 6 / 2) * (4 + 6) = (43 - 3) * (4 + 6) = 40 * 10 = 400

    ### Math: Floating Point Arithmetic
    An integer divided by an integer gives an integer, which is not accurate to real math, e.g:
    10 / 3 = 3
    4 / 3 = 1
    Floats/Doubles divide correctly, e.g:
    10.0 / 3.0 = 3.33333333

    ### Math: Arithmetic and Casting
    Casting during Math can be unpredictable, e.g:
    double bad = 5 / 3;
    double good = (double) 5 / (double) 3;
    Note: Java handles the right cast side before the left cast.

    ### Conditional Statements: The 'if' Statement
    Executes a block of code if the provided condition is true.
    The if statement uses equality operators (i.e. == <= != etc.)
    Please note that '=' is for assigning a variable, whereas '==' is for checking if two variables are equal.

    ### Conditional Statements: Logical Operators
    AND (&&) can be used to check if two statements are true.
    OR (||) can be used to check if one of two statements are true.
    These operators can be combined for more complicated logic operations.
    Short-circuiting when a logical OR operation is cut short because it has satisfied all conditions. Java will stop considering arguments once one fits the requirement in an OR statement, since the rest are redundant.

    ### Conditional Statements: Equality Operators
    < = less than
    <= less than or equal to
    > greater than
    >= greater than or equal to
    == equal to
    != not equal to. The exclamation point can be used independently too, such as with !boolean, which is going to check if a boolean is false.
    Equality operators allow for non-boolean values to be compared, such as if one number is less than the other.
    Strings are a little more complicated, since they are objects. When comparing strings, you will not use the above ^. You will work with String.equals(), or String.equalsIgnoreCase().
    This is because Strings are objects, not primitives.

    ### Conditional Statements: Nested 'if' Statements
    This is essentially an if statement inside of another if statement, this can be used for checking for multiple things in a more readable way, or it can be used to check for a condition, execute some code, then check for another condition if the last one was true.
    In Java, you can leave out the {} for if statements, this can only contain one statement, then leave the if statement.

*/

public class Driver {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a / b); // This will print 3, since both args are integers.
        System.out.println(a % b); // This will print 1, since it's the remainder of the above division.

        double c = 4 / 3; // IntelliJ will detect the problem in this, and will suggest that you adjust it. It will give an inaccurate answer.
        System.out.println(c);

        System.out.println((double) a / (double) b); // Casting both arguments to double will result in an accurate answer.
        System.out.println((int) ((double) a / (double) b)); // Casting a double to an int will discard the floating point values, meaning this will result in 1.

        System.out.println(Math.E + '\n' + Math.PI); // Java has a variety of existing constants and methods within the Math class, which can be previewed in Intellij.

        System.out.println(Math.pow(2, 3)); // This will get the power of the arguments provided, in this case: 8.0.

        System.out.println(Math.ceil(8.3)); // Will round 8.3 up to 9.0.
        System.out.println(Math.floor(8.3)); // Will round 8.3 down to 8.0.
        System.out.println(Math.floor(Math.PI)); // This can also be used on the constants mentioned above, like PI.

        boolean condition = true;
        boolean condition2 = true;
        if (condition) {
            System.out.println(condition); // This will execute as long as 'condition' is equal to true.
        }
        if (condition && condition2) {
            System.out.println(condition + " " + condition2); // This will execute as long as 'condition' and 'condition2' are both equal to true.
        }
        if (condition || condition2) {
            System.out.println(condition + " " + condition2); // This will execute as long as one of the two conditions is true.
        }
        if (!condition) {
            System.out.println(condition); // This will execute as long as the conditional is NOT true, due to the !.
        }
        if (5 == ((int) 5.5)) {} // This will be true, since casting to int will discard the .5, meaning it equates to 5.

        int z = 5, y = 6; // You can declare multiple variables of the same type using a comma.
        if (z == 5) {
            System.out.println("First statement passed."); // This will only execute if z is equal to 5.
            if (y == 6) System.out.println("Second statement passed."); // This will only execute if the previous condition was met, AND the current statement is met. Note that the {} are not used in the 2nd statement, as it's only one line. If another line is added, it will be executed regardless of the 2nd condition.
        }
    }

}
