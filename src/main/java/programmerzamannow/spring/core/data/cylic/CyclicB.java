package programmerzamannow.spring.core.data.cylic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicB {

    private CyclicC cyclicC;

}
