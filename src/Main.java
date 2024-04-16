public class Main {

    // Question 1 - calculateGrade
static char calculateGrade(int grade){
    if (grade >= 90) return 'A';
    else if (grade >= 80) return 'B';
    else if (grade >= 70) return 'C';
    else if (grade >= 60) return 'D';
    else if (grade >= 50) return 'E';
    return 'F';
}
    // Question 2 - fizzBuzz
static String fizzBuzz(int num){
    if (num%3 == 0){
        if (num%5 == 0) return "fizzbuzz";
        else return "fizz";
    }
    else if (num%5 == 0) return "buzz";
    else return "unlucky";
}
    // Question 3 - frontBack
static String frontBack(String word){
    if (word.length()<2) return word;
    else return (word.substring(0,2) + word + word.substring(0,2));
}
    // Question 4 - twoAsOne
static boolean twoAsOne(int num1, int num2, int num3){
    return (num1+num2 == num3 || num1+num3 == num2 || num2+num3==num1);
}
    // Question 5 - endUp
static String endUp(String word){
    if (word.length()<=3) return word.toUpperCase();
    else return word.substring(0,word.length()-3) + word.substring(word.length()-3,word.length()).toUpperCase();
}
}
