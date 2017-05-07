package co.linular.repository;

import co.linular.persistence.model.SearchableAreaTeamDefinition;
import co.linular.persistence.model.impl.AreaTeam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.repository.Highlight;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.Collection;

public interface AreaTeamRepository extends SolrCrudRepository<AreaTeam, String> {

    @Highlight(prefix = "<b>", postfix = "</b>")
    @Query(fields = { SearchableAreaTeamDefinition.ID_FIELD_NAME }, defaultOperator = org.springframework.data.solr.core.query.Query.Operator.AND)
    HighlightPage<AreaTeam> findByIdIn(Collection<String> ids, Pageable page);

    @Query("id:*?0* OR name:*?0*")
    public Page<AreaTeam> findByCustomQuery(String searchTerm, Pageable pageable);


}
