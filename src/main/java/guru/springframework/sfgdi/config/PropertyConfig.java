package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import guru.springframework.sfgdi.examplebeans.MyApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//alternative:
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Autowired
    Environment environment;

    @Value("${guru.jms.username}")
    String jmsuser;

    @Value("${guru.jms.password}")
    String jmspassword;

    @Value("${guru.jms.url}")
    String jmsurl;

    @Value("${application.guru.username}")
    String applicationUser;

    @Value("${application.guru.password}")
    String applicationPassword;

    @Value("${application.guru.dburl}")
    String applicationUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(environment.getProperty("USERNAME")); //os username
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsuser);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);

        return fakeJmsBroker;
    }

    @Bean
    public MyApplicationProperties myApplicationProperties() {
        MyApplicationProperties props = new MyApplicationProperties();
        props.setUser(applicationUser);
        props.setPassword(applicationPassword);
        props.setUrl(applicationUrl);

        return props;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

        return configurer;
    }
}
