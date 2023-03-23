package fr.formation.formationdevops;

public class FizzBuzz {
    

    public String process(int min, int max) {
        String result = "";

        for (int i = min; i <= max; i++) {
            if (i % 15 == 0) {
                result += "FizzBuzz";
            }
            
            else if (i % 3 == 0) {
                result += "Fizz";
            }

            else if (i % 5 == 0) {
                result += "Buzz";
            }

            else {
                result += "" + i;
            }
        }

        return result;
    }

}
