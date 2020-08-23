
public class HelloWorld{

    public static void main(String[] args){
        while(! (args.length > 0) ){
            System.out.println("Must need to write your name like first parameter");
            return;
        }
        System.out.println("Hola mundo :D\nand hello " + args[0]);
    }
}
