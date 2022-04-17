package onlyme.laboratory.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static ObjectMapper om = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    public static void main(String[] args) throws JsonProcessingException {

//        Member m = new Member("devyu", 99);
//        String s = om.writeValueAsString(m);
//        System.out.println(s);

        String jsonStr = "{\"name\":\"min\",\"age\":20}";
        Member member = om.readValue(jsonStr, Member.class);
        String s = om.writeValueAsString(member);
        log.info("{}", s);

        String s2 = om.writeValueAsString(member.getUnknownProperties());
        log.info("{}", s2);

    }
}
