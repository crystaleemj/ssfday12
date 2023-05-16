package sg.nus.iss.visa.ssf.day12demo1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// create a controller class


// accessing api portion of the uri
// e.g localhost:8080/api
@RestController
@RequestMapping(path = "/api")
public class DemoController {

    // accessing api method 'home' to be called on uri
    // e.g localhost:8080/api/home
    @GetMapping("/home/{name}")
    public HelloWorld getHome(@PathVariable String name){
        // return a HelloWord object from the HelloWorld.java class as json format
        // in order to return a json format, return an object
        // if we return a String "hello world", we will get a text not in json
        // can use a get method to return a single var, in text and not in json
        return new HelloWorld(name);
    }
    

   
}
