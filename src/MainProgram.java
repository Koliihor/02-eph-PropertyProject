public class MainProgram {

    public static void main(String[] args) {
        Property p1 = new Property("Erzbergerstraße 1",10,20.57);
        System.out.println(p1.getAddress() + " - " + p1.getSize() +  "m²" );

        Property p2 = new Property("Erzbergerstraße 2",15,22.212);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²" );
    }
}
