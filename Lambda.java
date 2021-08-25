public class Lambda implements LambdaInterface {

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        LambdaInterface interface1 = new Lambda();
        interface1.sayHello(); // $Simple implementation
        LambdaInterface iLambdaInterface = new LambdaInterface(){
            
            public void sayHello(){
                System.out.println("Hello World (anonymous)");
            }
        };
        iLambdaInterface.sayHello();// $ Anonymous class

        LambdaInterface iLambda = () -> {
            System.out.println("Hello World (lambda)");
        };
        iLambda.sayHello(); // $ Lambda Expression
    }

}
