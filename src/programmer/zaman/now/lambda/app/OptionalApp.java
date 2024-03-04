package programmer.zaman.now.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Hanif");

        String name = null;

        sayHello(name);

    }

    //digunakan untuk menghindari null exception
    public static void sayHello(String name){
        //lambda chain 2 lambda
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value-> System.out.println("HELLO "+value),
                        ()-> System.out.println("HELLO")
                );

        //lambda biasa
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        optionalNameUpper.ifPresent(value -> System.out.println("HELLO "+value));

        //kalau menggunakan if check null
//        if(name != null){
//            String upperName = name.toUpperCase();
//            System.out.println("HELLO "+name);
//        }
    }
}
