public class Main
{
    public  static void main(String[] args)
    {
        Fifo f = new Fifo();
        
        f.push("Hallo");
        f.push("a");
        f.push("KLSDK");
        for(int i =0; i<3; i++){
            System.out.println(f.pop());

        }
    }


}