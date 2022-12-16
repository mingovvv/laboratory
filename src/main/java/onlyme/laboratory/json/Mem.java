package onlyme.laboratory.json;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mem {
    private String school;
    private int distance;

    public Mem(String school, int distance) {
        this.school = school;
        this.distance = distance;
    }
}
