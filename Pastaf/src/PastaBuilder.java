public class PastaBuilder {
    public void on(){
        System.out.println("Pasta machine is turned on");
    }
    public void off(){
        System.out.println("Pasta machine is turned off");
    }
    public void doordashmake(){
        System.out.println("Pasta machine is turned on");
    }
    public void doordashcancel(){
        System.out.println("Pasta machine is turned off");
    }

    public void PresetPizaa(int defaultpasta){
        System.out.println("Pasta machine is set to :"+defaultpasta);
    }
    public void setFlour(int Flour){
        System.out.println("Pasta machine flour is set to "+Flour);
    }

    public void setShape(int defaultshape){
        System.out.println("Pasta machine pasta shape is set to "+defaultshape);
    }
    public void CancelOrder(int Orderiscancelled){
        System.out.println("Pasta machine is set to 1-dump the flour,2-reset to default pizza,3-set flour to default"+Orderiscancelled);
    }
}
