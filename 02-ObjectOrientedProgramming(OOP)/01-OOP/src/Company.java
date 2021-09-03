public class Company {
    int coin;
    String name;

    public void sayhello(){
        System.out.println("Hi, "+this.name);
    }

//    public Company(String name) {
//        this.name = name;
//    }

    public void By(){
        System.out.println("Good By :), "+this.name +"\n");
    }

    public void showinfo(){
        System.out.println("Information Human { ");
        System.out.println("        name -> "+this.name);
        System.out.println("        coin -> "+this.coin);
        System.out.println("}");
    }

}
