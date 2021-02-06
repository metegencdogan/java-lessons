package nesteds;

public class OuterClass {

    public OuterClass() {
        System.out.println("Hello outer class");
    }


    //1.static nested class
    public static class StaticNestedClass {

        public StaticNestedClass() {
            System.out.println("Hello static nested class");
        }

        public void staticNestedClassMethod() {
            System.out.println("Hello static nested class method");
        }

    }

    //2.inner class
    public class InnerClass {

        public InnerClass() {
            System.out.println("Hello inner class");
        }

        public void innerClassMethod() {
            System.out.println("Hello inner class method");
        }

    }

    //3.local classes
    //4.anonymous classes
    public void instanceMethod() {
        /*
        RULE
        When you want to declare a variable in a method and if you want to use this variable in a Local Class, this variable
        should be FINAL or EFFECTIVELY FINAL.
        FINAL VARIABLE -> (Example) final int FINAL_VAR = 100 -> you can not change it.( You can try :) )
        EFFECTIVELY FINAL VARIABLE -> (Example) int effectivelyFinalVar = 100 -> Normally you are able to change it but it should behave like finals.
        So if you change it inside of method, you can not use it inside of Local Classes. (You should try it :) )
        */
        int localVariable = 500;

        //3:
        class LocalClass {
            public LocalClass() {
                System.out.println("Hello local class");
            }

            public void localClassMethod() {
                System.out.println("Hello local class method");
            }
        }

        //4:
        Object anonymousClassInstance = new Object() {

            @Override
            public String toString() {
                anonymousClassMethod();
                return "Hello anonymous";
            }

            public void anonymousClassMethod() {
                System.out.println("Hello anonymous class method");
            }

        };

        //We are still inside of the instanceMethod
        //Local Class
        LocalClass localClass = new LocalClass();
        localClass.localClassMethod();


        //Anonymous Class
        System.out.println(anonymousClassInstance.toString());



    }
}
