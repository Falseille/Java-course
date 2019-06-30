public class Ordering {
    /*
    Elements in a class have to be in the right order.
    package namepackage ; always comes on the first line if there is no comment on the first line,
                          its not needed to write it down.
    import java.util.* ;  always comes after package if there is no comment after package.
                          its not needed to write it down.
    class nameclass ;     always comes after import if there is no comment.
                          its always needed.
    Field int/double etc; can put anywhere inside a class.
    Method void name   ; can put anywhere inside a class.
    Comments can be put anywhere.
     */

    /*
    Example one
    package projectcourse;
    import java.util.*;
    public class CourseStart {
    int CourseStarted;
    // comment
    }
    Example one is good.

    Example two
    //comment
    package projectcourse;
    import java.util.*;
    public class CourseStart {
    public void Started (int CourseStarted);
    }
    Exmaple 2 is also good because comments can be putted anywhere.

    Example three
    import java.util.*;
    public class CourseStart {
    package projectcourse;
    //comment
    publice void Started (int CourseStarted);
    }
    Example 3 is not good because package is always on the first line if there is no comment.
    Further is it good.
    If the import was after public class it won't compile either.

     */
}
