package nl.cloudfoundry.musicdb.georges2017.config.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("mysql-cloudF")
public class MySqlLocalDataSourceConfig extends AbstractLocalDataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return createDataSource("jdbc:mysql://localhost/music", "com.mysql.jdbc.Driver", "", "");
    }

}
