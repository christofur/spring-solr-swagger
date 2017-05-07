package co.linular.web.controller;

import co.linular.persistence.model.impl.AreaTeam;
import co.linular.service.IService;
import co.linular.service.impl.AreaTeamService;
import co.linular.util.RouteMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = RouteMappings.AREATEAM)
public class AreaTeamController extends AbstractController {

    @Autowired
    private AreaTeamService areaTeamService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<AreaTeam> findAll(){
        return areaTeamService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public AreaTeam findById(@PathVariable("id") final String id){
        return areaTeamService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final AreaTeam resource){
        createInternal(resource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") final String id, @RequestBody final AreaTeam resource){
        updateInternal(resource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") final String id){
        deleteInternal(id);
    }


    @Override
    public IService getService() {
        return areaTeamService;
    }
}
