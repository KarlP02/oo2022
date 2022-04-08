package ee.karl.webshop.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListController {
    List<String> strings = new ArrayList<>(Arrays.asList("Scooby Doo", "Mickey Mouse", "Donald Duck"));

    @GetMapping("strings")
    public List<String> getStrings() {
        return strings;
    }

    @GetMapping("strings/{index}")
    public String getString(@PathVariable int index) {
        return strings.get(index);
    }

    @DeleteMapping("strings/{index}")
    public String deleteString(@PathVariable int index) {
        return strings.remove(index);
    }

    @DeleteMapping("strings")
    public String deleteAllString() {
        strings.clear();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("strings")
    public void addString(@RequestBody String string) {
        strings.add(string);
    }

    @PutMapping("strings/{index}")
    public void editString(@PathVariable int index, @RequestBody String string) {
        strings.set(index, string);
    }

}
