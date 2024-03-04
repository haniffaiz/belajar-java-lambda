package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase =  StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hanif"));
        System.out.println(predicateIsLowerCase.test("hanif"));

        //Method Reference di Parameter

//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Hanif"));

    }

    //start bukan statik
    public void run(){

        //objek sendiri
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hanif"));
        System.out.println(predicateIsLowerCase.test("hanif"));
    }

    public void run2(){
        //objek lain
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hanif"));
        System.out.println(predicateIsLowerCase.test("hanif"));
    }

    public boolean isLowerCase(String value){
        for(var c : value.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
    //end bukan statik
}
