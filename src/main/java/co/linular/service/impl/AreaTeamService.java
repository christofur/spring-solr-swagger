package co.linular.service.impl;

import co.linular.persistence.model.impl.AreaTeam;
import co.linular.persistence.model.impl.Cost;
import co.linular.repository.AreaTeamRepository;
import co.linular.repository.CostRepository;
import co.linular.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AreaTeamService extends AbstractService<AreaTeam> {
    private AreaTeamRepository areaTeamRepository;

    @Override
    public AreaTeam findOne(String id) {
        return areaTeamRepository.findOne(id);
    }

    @Override
    public List<AreaTeam> findAll() {

        List<AreaTeam> uniques = new ArrayList<>();

        for(AreaTeam team : areaTeamRepository.findAll()){

            String thisCode = team.getAreaTeamCode();
            if(thisCode != null && uniques.stream().noneMatch(x -> x.getAreaTeamCode().equals(thisCode))){
                uniques.add(team);
            }
        }

        return uniques;
    }

    @Override
    public AreaTeam create(AreaTeam resource) {
        areaTeamRepository.save(resource);
        return resource;
    }

    @Override
    public void update(AreaTeam resource){
        areaTeamRepository.save(resource);
    }

    @Override
    public void delete(String id){
        areaTeamRepository.delete(id);
    }

    @Autowired
    public void setAreaTeamRepository(AreaTeamRepository areaTeamRepository) {
        this.areaTeamRepository = areaTeamRepository;
    }
}
