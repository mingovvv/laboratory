package onlyme.laboratory.json;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Getter
@ToString
public class Member {

    private String name;
    private int age;
    private Map<String, Object> unknownProperties = new HashMap<>();

    @JsonAnySetter
    public void collectUnknown(String name, Object value) {
        unknownProperties.put(name, value);
    }

}
