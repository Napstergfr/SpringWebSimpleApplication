package com.napster.sirvices;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    List<String> names = new ArrayList<>();
    public HelloService() {
        names.add("Golam");
        names.add("Rabbi");
        names.add("Karim");
    }
    public List getNames() {
        return  names;
    }
    public String name() {
        return "Mr Napster";
    }
}
