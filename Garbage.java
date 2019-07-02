public class Garbage  {
/* What is important to know from garbage collector, is that it will destroy objects who are not needed.
What important is to know that it is all objects are stored in the heap

What is a heap
A heap represent a unused memory what is allocated to the Java application. The size of the heap is depending on its
environment.

Garbage Collection
This is a process what is freeing memory on the heap by deleting the objects who are not longer reachable in the program
There is a method called System.gc(), this method is only a request, Java is allowed to ignore the method what can
run the garbage.

When is an object not reachable?
A object is not reachable when there is no any reference to it. Another reason is when all references to the object are
not in the scope anymore.

What is finalize?
This is a method what will be called when the garbage collector tries to collect the object. What important is to know
the finalizer will run zero or one time and will never run a second time. 

 */

// example of garbage.
    public static void main(String [] args){
        String adelaide , whyalla;
                adelaide = new String ("capitalofsouthaustralia");
                whyalla  = new String("placeinsouthaustralia");
                adelaide = whyalla;
                String glenelg = adelaide;
                adelaide = null;

    }

}
