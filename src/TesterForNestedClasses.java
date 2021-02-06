import nesteds.OuterClass;


public class TesterForNestedClasses {


    public static void main(String[] args) {


        //To access to the STATIC CLASS and INSTANCES
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.staticNestedClassMethod();



        //To access to the INNER CLASS and INSTANCES
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.innerClassMethod();
        //OR
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass();



        //To access to the LOCAL CLASS and INSTANCES
        OuterClass outerClass1 = new OuterClass();
        outerClass1.instanceMethod(); // !!! PLEASE LOOK AT OuterClass Line 75-82

    }


}
