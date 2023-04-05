import io.javalor.componentscanner.ComponentScanner;
import io.restfulness.microservice.annotation.stereotype.ServiceComponent;


import java.io.IOException;

@ServiceComponent
public class Main {

    public static void main(String[] args) {


        System.out.println(Main.class.getProtectionDomain().getCodeSource());

        ComponentScanner cs = new ComponentScanner();
        cs.getScannedClass().forEach(System.out::println);
        System.out.println("Done");


    }
}
