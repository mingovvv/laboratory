package onlyme.laboratory.crawling;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TemplateMng {

    private String prifileKey;
    private String templateName;
    private String templateCode;
    private String templateContext;

    @Builder
    public TemplateMng(String prifileKey, String templateName, String templateCode, String templateContext) {
        this.prifileKey = prifileKey;
        this.templateName = templateName;
        this.templateCode = templateCode;
        this.templateContext = templateContext;
    }

}
