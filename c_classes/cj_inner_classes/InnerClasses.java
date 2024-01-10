package c_classes.cj_inner_classes;

class OuterClass {
    int x = 10;
    static int z = 20;
  
    class InnerClass {
        int y = 5;
        public int myInnerMethod() {
            return x;
        }
    }

    // Private inner classes cannot be seen outside the outer class
    private class InnerClass2 {
        int y = 5;
        public int myInnerMethod() {
            return x + y;
        }
    }

    static class InnerClass3 {
        int y = 5;
        public int myInnerMethod() {
            // The static inner class cannot see x, but it can see static z
            return z;
        }
    }

    public int SeeInnerClass() {
        // Private class is visible here, since we are still inside the outer class
        InnerClass2 ic2 = new InnerClass2();
        return ic2.myInnerMethod();
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        // This would result in an error because the inner class is private (not visible)
        // OuterClass.InnerClass2 myInner2 = myOuter.new InnerClass2();
        System.out.println(myOuter.SeeInnerClass());

        // Static inner class is constructed from the outer class, not the object
        OuterClass.InnerClass3 myInner3 = new OuterClass.InnerClass3();
        System.out.println(myInner3.y);

        System.out.println(myInner.myInnerMethod());
        System.out.println(myInner3.myInnerMethod());
    }
}
