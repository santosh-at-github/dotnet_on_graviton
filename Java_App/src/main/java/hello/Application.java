package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        String str = "<p>Hello Docker World.</p><p>I'm running inside Amazon EKS and the Java Runtime version is " + System.getProperty("java.runtime.version") + " from "+ System.getProperty("java.vm.name") + " and my Java home is " + System.getProperty("java.home") + "</p>";
        str = str.concat("<p>Operating System details: ").concat(System.getProperty("os.arch")).concat(" ").concat(System.getProperty("os.name")).concat(" ").concat(System.getProperty("os.version")).concat("</p>");
        str = str.concat("<br><p>Note: This is for demonstration purposes ONLY !! </p>");
        return str;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
