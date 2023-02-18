package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import programmerzamannow.spring.core.data.Bar;
import programmerzamannow.spring.core.data.Foo;

@Slf4j
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn("bar")
    public Foo foo (){
        log.info("Creat new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar (){
        log.info("Creat new Bar");
        return new Bar();
    }
}
