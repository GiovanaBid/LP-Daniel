public class TestaSmartTv {
    public static void main(String[] args){
        SmartTv st1 = new SmartTv();
        st1.setVolume(120);
        st1.setVolume(40);
        System.out.println("Volume de st1 " + st1.getVolume());

        SmartTv st2 = new SmartTv("Samsung", "Widescreen 65", 0, true);

        SmartTv st3 = new SmartTv("Samsung", "Widescreen 65", -10, true);

    }
}