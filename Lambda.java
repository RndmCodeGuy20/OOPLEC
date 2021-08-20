public class Lambda implements LambdaInterface {

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        LambdaInterface interface1 = new Lambda();
        interface1.sayHello();
        LambdaInterface iLambdaInterface = new LambdaInterface(){
            
            public void sayHello(){
                System.out.println("Hello World (anonymous)");
            }
        };
        iLambdaInterface.sayHello();

        LambdaInterface iLambda = () -> {
            System.out.println("Hello World (lambda)");
        };
        iLambda.sayHello();
    }

}
