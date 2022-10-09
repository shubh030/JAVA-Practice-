interface Tvremote{
    void changeChanel();
    void changeVolume();
}
interface smartTvremote extends Tvremote{
  void ConnectWifi();

}
class stv implements smartTvremote{
    public void changeChanel(){
        System.out.println("Changing chanel");
    }
    public void changeVolume() {
        System.out.println("cjanging Volueme");

    }
    public void ConnectWifi() {
        System.out.println("coneccting");
    }
}

public class interfaceTV {
    public static void main(String[] args) {
        stv s=new stv();
        s.changeChanel();
        s.ConnectWifi();
        s.changeVolume();
    }
}
