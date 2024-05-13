package InterfaceAndAbstracClass.Interface;

public class IndonesiaTraffic implements CentralTraffic, SymbolTraffic{

    public void walkSymbol() {
        System.out.println("Walk in pedestrian");
    }

    //CentralTraffic InterfaceAndAbstracClass.Interface
    @Override
    public void greenGo() {
        System.out.println("GreenGo implementations");
    }

    @Override
    public void redStop() {
        System.out.println("redStop implementations");

    }

    @Override
    public void flashYellow() {
        System.out.println("flashYellow implementations");

    }

    //SymbolTraffic
    @Override
    public void stopSymbol() {
        System.out.println("stopSymbol implementations");

    }

    public static void main(String[] args) {
        CentralTraffic  cit = new IndonesiaTraffic();
        cit.greenGo();
        cit.redStop();
        cit.flashYellow();

        IndonesiaTraffic it = new IndonesiaTraffic();
        it.walkSymbol();

        SymbolTraffic st = new IndonesiaTraffic();
        st.stopSymbol();
    }


}
