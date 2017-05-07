package co.linular.persistence.model.impl;

import co.linular.persistence.model.ICodeEntity;
import co.linular.persistence.model.SearchableAreaTeamDefinition;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "govdata2")
public class AreaTeam implements ICodeEntity, SearchableAreaTeamDefinition {

    private @Id @Indexed long id;
    private @Indexed String AreaTeamCode;
    private @Indexed String AreaTeamName;

    @Override
    public String getCode() {
        return getAreaTeamCode();
    }

    @Override
    public void setCode(String code) {
        setAreaTeamCode(code);
    }

    public String getAreaTeamCode() {
        return AreaTeamCode;
    }

    public void setAreaTeamCode(String areaTeamCode) {
        AreaTeamCode = areaTeamCode;
    }

    public String getAreaTeamName() {
        return AreaTeamName;
    }

    public void setAreaTeamName(String areaTeamName) {
        AreaTeamName = areaTeamName;
    }
}
