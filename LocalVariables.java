
public class LocalVariables {

    public int notValid() {
        int y = 10;
        int x;
        int reply = x + y;
        return reply;
        System.out.println(reply);
    }

    public int Valid () {
        int y = 10;
        int x;
        x = 3; //  This one is initialized, because there is a value for X.
        int replyValid = x + y;
        return  replyValid;
        System.out.println(replyValid);
        // This cannot be printed out because of the statement return, cannot complete it normally because it is not followed by a return value.
        // It is in a infinite loop in this code of block.
    }

    public void findAnswer (boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer =1;
        }
        else {
            answer = 2;
        } //The compiler is happy for the initializing because answer is initialized and will compile.
        // onlyOneBranch will not compile because it is not initialized.
        System.out.println (answer);
        System.out.println(onlyOneBranch);
    }
}

