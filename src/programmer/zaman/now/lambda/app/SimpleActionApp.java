package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {

    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Hanif";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        SimpleAction simpleAction2 = (String name) -> {
//          return "Hanif";
//        };
//
//        System.out.println(simpleAction2.action("Hanif"));

        //bisa tambahkan tipe data
        SimpleAction simpleAction1 = (String value) -> {
          return "Hello" + value  ;
        };

        //tanpa tipe data
        SimpleAction simpleAction2 = (name) -> {
            return "Hello" + name  ;
        };

        //one line 1
        SimpleAction simpleAction3 = (String value) -> "Hello" + value;

        //one line 2
        SimpleAction simpleAction4 = (value) -> "Hello" + value;

        //one line 3
        SimpleAction simpleAction5 = value -> "Hello" + value;

}
}
