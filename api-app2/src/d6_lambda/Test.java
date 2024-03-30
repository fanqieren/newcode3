package d6_lambda;

public class Test {
    public static void main(String[] args) {

//        swimming si= new swimming(){
//            @Override
//            public void swim() {
//                System.out.println("xueshenyouy");
//            }
//        };
//        si.swim();

        swimming si= ()->{
            System.out.println("xueshenyouy");
        };
        si.swim();
}}
abstract class Animal {
    public abstract void run();
}
interface swimming {
    void swim();
}