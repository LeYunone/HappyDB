package xyz.leyuna.happydb.core.autoconfigure.auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import xyz.leyuna.happydb.core.autoconfigure.properties.HappyListenProperties;

import javax.sql.DataSource;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-23
 */
@Configuration
@EnableConfigurationProperties(HappyListenProperties.class)
@ConditionalOnBean(DataSource.class)
public class HappyDBAutoConfiguration {

    public HappyDBAutoConfiguration(){

    }
}
