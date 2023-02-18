package programmerzamannow.spring.core.client;

import lombok.Data;

// example third party not modification

@Data
public class PaymentGatewayClient {

    private String endpoint;
    private String privateKey;
    private String publicKey;

}
