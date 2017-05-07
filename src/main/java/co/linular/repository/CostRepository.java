package co.linular.repository;

import co.linular.persistence.model.SearchableCostDefinition;
import co.linular.persistence.model.impl.Cost;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.HighlightPage;
import org.springframework.data.solr.repository.Highlight;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.Collection;

public interface CostRepository extends SolrCrudRepository<Cost, String> {

    @Highlight(prefix = "<b>", postfix = "</b>")
    @Query(fields = { SearchableCostDefinition.ID_FIELD_NAME }, defaultOperator = org.springframework.data.solr.core.query.Query.Operator.AND)
    HighlightPage<Cost> findByIdIn(Collection<String> ids, Pageable page);

}
