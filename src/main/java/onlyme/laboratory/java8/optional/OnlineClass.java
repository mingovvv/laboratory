package onlyme.laboratory.java8.optional;

import lombok.AllArgsConstructor;

import java.util.Optional;


@AllArgsConstructor
public class OnlineClass {

    private Long id;
    private String title;
    private boolean closed;
    private Progress progress;

    public OnlineClass(Long id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Optional<Progress> progress) {
        // 매개변수를 Optional을 사용할 경우.. 이중체크가 필요하다..
        if (progress != null) { // 1. 매개변수가 null 인지 확인
            progress.ifPresent(s -> this.progress = s); // 2. Optional이 존재하는지 확인
        }
    }
}
