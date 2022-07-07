package bg.softuni.pathfinder.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class UserSession {

    private long id;

    public UserSession() {
    }

    public long getId() {
        return id;
    }

    public UserSession setId(long id) {
        this.id = id;
        return this;
    }
}
