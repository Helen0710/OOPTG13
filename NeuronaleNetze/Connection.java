public class Connection {
    
    private mainN neuron;
    private float weight;

    public Connection (mainN neuron, float weight)
    {
        this.neuron = neuron; 
        this.weight = weight;
    }

    public float getValue()
    {
        return neuron.getValue() * weight;
    }
}