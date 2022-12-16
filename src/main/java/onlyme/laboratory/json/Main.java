package onlyme.laboratory.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static ObjectMapper om = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    public static void main(String[] args) throws JsonProcessingException {

//        Member m = new Member();
//        m.setAge(15);
//        m.setName("devyu");
//        m.setMem(Arrays.asList(new Mem("양초", 12435)));

//        String s = om.writeValueAsString(m);
//        System.out.println(s);

        String jsonStr = "{\"name\":\"devyu\",\"age\":15,\"mem\":[{\"school\":\"양초\",\"distance\":12435}]}";
        Member member = om.readValue(jsonStr, Member.class);
        System.out.println(member);
        String s = om.writeValueAsString(member);
        log.info("{}", s);

        String s2 = om.writeValueAsString(member.getUnknownProperties());
        log.info("{}", s2);

    }
}
