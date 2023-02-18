package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(value = MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
