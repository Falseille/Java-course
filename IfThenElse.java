public class IfThenElse {
    public static void main (String[] args) {

        /* If then statement is a statement that can be executed in certain circumstances.
        It can be executed when the boolean expression is true.
         */

        int distance = 60;

        if (distance < 100) {
            System.out.println("It's not that far");
        }

        /* There is also as the title of this class mentioned. if then else principle.
        This means when for example the if is not true, there can be an else declared also. So it will have another
        outcome when it is false for example.
        But there is also a possibility to do this more than once!
         */
        int height = 2500;

        if(height < 800) {
            System.out.println("This is a hill");
        }
        else if (height < 1600) {
            System.out.println("This is a mountain");
        }

        else if (height <2000) {
            System.out.println("This is a big moutaint");
        }

        else {
            System.out.println("This is a giant mountain");
        }

        // Switch statement part

        /* A switch statement is a decision making structure. Whereby a single value will be evaluated and the flow
        will be redirected to the first matching branch.
        Branch is also known as case statement. When there is no branch to find, default will be taken otherwise
        it will just skip the switch statement if it never happened.
         */

        int country = 4;

        switch (country) {
            default:
                System.out.println("France");
                break;
            case 0:
                System.out.println("Belgique");
                break;
            case 4:
                System.out.println("Luxembourg");
                break;
        }
         //It will print out Luxembourg because case 4 is the matching with the integer what is initialized.

        


        }}