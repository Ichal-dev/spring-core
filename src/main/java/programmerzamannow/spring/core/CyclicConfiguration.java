package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import programmerzamannow.spring.core.data.cylic.CyclicA;
import programmerzamannow.spring.core.data.cylic.CyclicB;
import programmerzamannow.spring.core.data.cylic.CyclicC;

public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA (CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB (CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC (CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
