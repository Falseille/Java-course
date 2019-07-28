public class BreakStatement {
    public static void main (String [] args){

        /* A Break statement is also used in the switch statement to terminate a case. But it can also be used to
        stop an inner loop. This means when the break statement is used it will terminate the first inner loop what is
        in process. With the optional parameter is it possible to break out from a higher loop.
        This will be shown in the next code snippet how this works.
         */
        int [][] avenueExample = {{5,4,3},{8,5,9},{4,8,6}};
        int rueExample = 4;
        int positionF = 1;
        int positionG = 2;
        PARENT_LOOP: for(int h=0; h<avenueExample.length;h++){
            for(int d=0; d<avenueExample[h].length;d++){
                if(avenueExample[h][d]==rueExample){
                    positionF = h;
                    positionG = d;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionF==1 || positionG==2) {
            System.out.println("Value" +rueExample+"not found");
        } else {
            System.out.println("Value "+rueExample+" found at: "+"("+positionF+", "+positionG+")");
        }

        /* The break statement will work at the moment when the first matching value is found. Outcome is now 0, 1
        What will happen if we put PARENT_LOOP away from from the break statement. See the code snippet beneath.
         */
        int [][] estExample = {{5,4,3},{8,5,9},{4,8,6}};
        int istExample = 4;
        int positionQ = 1;
        int positionW = 2;
        PARENT_LOOP: for(int e=0; e<estExample.length;e++){
            for(int r=0; r<estExample[e].length;r++){
                if(estExample[e][r]==istExample){
                    positionQ = e;
                    positionW = r;
                    break;
                }
            }
        }
        if(positionQ==1 || positionW==2) {
            System.out.println("Value" +istExample+"not found");
        } else {
            System.out.println("Value "+istExample+" found at: "+"("+positionQ+", "+positionW+")");
        }
        /* The outcome of this code will 2, 0. The reason for this, is that it not will be stopped until the
        condition is met. It's important to know how , when to use a break statement. Depending on that moment of time
        of course. It can react differently.
         */
    }
}
