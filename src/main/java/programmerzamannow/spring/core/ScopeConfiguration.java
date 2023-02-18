package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import programmerzamannow.spring.core.data.Foo;

@Slf4j
public class ScopeConfiguration {

    @Scope("prototype")
    @Bean
    public Foo foo(){
        log.info("Create New Foo");
        return new Foo();
    }

}
