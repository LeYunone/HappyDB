package xyz.leyuna.happydb.core.autoconfigure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-23
 */
@ConfigurationProperties(prefix = "happy.listen")
public class HappyListenProperties {

    private List<String> actions;

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }
}
