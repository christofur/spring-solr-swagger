package co.linular.web.controller;


import co.linular.util.RouteMappings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = RouteMappings.SEARCH)
public class SearchController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<String> findAll(){

        List<String> results = new ArrayList<>();
        results.add("001");
        results.add("001");
        results.add("003");

        return results;
    }

}
