public class NestedIfTest {

    public static void main(String[] args) {
        /*
        * syntax:
        * if(condition-1) {
        *
        * if(condition-2) {
        *
        * if(condition-3) {
        * .....
        * .........
        * }else{
        * }
         */
        String citizen = "nepali";
        int age = 32;
        boolean voterId = true;

        if (citizen.equals("nepali")) {

            if(age >= 18) {
                if(voterId)

                System.out.println("You can vote!! ");
            }else{
                System.out.println("You are under age !!");

            }

        }
        else{
            System.out.println("You are not Nepali !!");

        }

    }
}
