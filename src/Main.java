public class Main {
    public static void main(String[] args) {

        Huntable[] animal= {new Wolf("Akello","gray",7),
                           new Bear("Grizzly","black",10),
                           new Lion("Sinba","red",9)};



        for (Huntable h :animal){
            h.hunt();
        }

    }

}