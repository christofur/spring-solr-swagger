package co.linular.persistence.model.impl;

import co.linular.persistence.model.IEntity;
import co.linular.persistence.model.SearchableCostDefinition;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "govdata2")
public class Cost implements IEntity, SearchableCostDefinition {

    private @Id @Indexed long id;
    private @Indexed String Quarter;
    private @Indexed String AreaTeamCode;
    private @Indexed String AreaTeamName;
    private @Indexed String CCGName;
    private @Indexed String Chapter;
    private @Indexed String ChapterName;
    private @Indexed String Section;
    private @Indexed String SectionName;
    private @Indexed String Items;
    private @Indexed String ActualCost;
    private @Indexed String NIC;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getQuarter() {
        return Quarter;
    }

    public void setQuarter(String quarter) {
        Quarter = quarter;
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

    public String getCCGName() {
        return CCGName;
    }

    public void setCCGName(String CCGName) {
        this.CCGName = CCGName;
    }

    public String getChapter() {
        return Chapter;
    }

    public void setChapter(String chapter) {
        Chapter = chapter;
    }

    public String getChapterName() {
        return ChapterName;
    }

    public void setChapterName(String chapterName) {
        ChapterName = chapterName;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getSectionName() {
        return SectionName;
    }

    public void setSectionName(String sectionName) {
        SectionName = sectionName;
    }

    public String getItems() {
        return Items;
    }

    public void setItems(String items) {
        Items = items;
    }

    public String getActualCost() {
        return ActualCost;
    }

    public void setActualCost(String actualCost) {
        ActualCost = actualCost;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
}
