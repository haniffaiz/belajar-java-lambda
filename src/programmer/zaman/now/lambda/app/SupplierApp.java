package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hanif Faiz Hidayat";

        System.out.println(supplier.get());

    }
}
