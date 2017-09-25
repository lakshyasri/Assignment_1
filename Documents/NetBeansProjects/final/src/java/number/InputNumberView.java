
package number;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InputNumberView {
    private Double input1 = new Double(0);
    

public InputNumberView() {
        input1 = 0d;
}
public Double getInput1() {
        return input1;
    }
}