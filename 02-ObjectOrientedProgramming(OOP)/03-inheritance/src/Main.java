public class Main {
    public static void main(String[] args) {
        Company human1 = new Company();
        human1.setCoin(14);
        human1.setName("Ali");

        System.out.println("Information Human { ");
        System.out.println("        name -> "+human1.getName());
        System.out.println("        coin -> "+human1.getCoin());
        System.out.println("}");


        Company human2 = new Company();
        human2.setCoin(56);
        human2.setName("Mohammad");

        System.out.println("Information Human { ");
        System.out.println("        name -> "+human2.getName());
        System.out.println("        coin -> "+human2.getCoin());
        System.out.println("}");


        //---------------------------------------------

        Google g = new Google();
        g.setCoin(150);
        g.setName("Sundar Pichai");
        g.setNumber(135301);

        System.out.println("Information Company { ");
        System.out.println("        name -> "+g.getName());
        System.out.println("        coin -> "+g.getCoin());
        System.out.println("        Numbers -> "+g.getNumber());
        System.out.println("}");

    }
}

