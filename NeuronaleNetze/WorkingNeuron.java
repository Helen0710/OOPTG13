import java.util.ArrayList;
import java.util.List;



public class WorkingNeuron extends mainN{

    private List<Connection> connection = new ArrayList <>();
    @Override
    public float getValue() {
        float sum = 0;
        for (Connection c: connection)
        {
            sum += c.getValue();

        }
    
        return sum;

}
}