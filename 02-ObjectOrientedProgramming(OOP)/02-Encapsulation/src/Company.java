public class Company {
    private int coin;
    private String name;

//    public void sayhello(){
//        System.out.println("Hi, "+this.name);
//    }
//
//    public void By(){
//        System.out.println("Good By :), "+this.name +"\n");
//    }
//
//    public void showinfo(){
//        System.out.println("Information Human { ");
//        System.out.println("        name -> "+this.name);
//        System.out.println("        coin -> "+this.coin);
//        System.out.println("}");
//    }


    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

