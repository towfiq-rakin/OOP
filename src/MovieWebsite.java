abstract class Hollywood {
    String genre;
    int length;
    int releaseYear;
    String casts;
    double imdbRating;

    public Hollywood(String genre, int length, int releaseYear, String casts, double imdbRating) {
        this.genre = genre;
        this.length = length;
        this.releaseYear = releaseYear;
        this.casts = casts;
        this.imdbRating = imdbRating;
    }

    public void display(String movieName) {
        System.out.println(movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Casts: " + casts);
        System.out.println("IMDb Rating: " + imdbRating);
    }
}

class TheNun2 extends Hollywood {
    public TheNun2(String genre, int length, int releaseYear, String casts, double imdbRating) {
        super(genre, length, releaseYear, casts, imdbRating);
    }

    public void display() {
        super.display("The Nun 2");
    }
}

class Wish extends Hollywood {
    public Wish(String genre, int length, int releaseYear, String casts, double imdbRating) {
        super(genre, length, releaseYear, casts, imdbRating);
    }

    public void display() {
        super.display("Wish");
    }
}

class TheCreator extends Hollywood {
    public TheCreator(String genre, int length, int releaseYear, String casts, double imdbRating) {
        super(genre, length, releaseYear, casts, imdbRating);
    }

    public void display() {
        super.display("The Creator");
    }
}

public class MovieWebsite {
    public static void main(String[] args) {
        TheNun2 theNun2 = new TheNun2("Horror", 120, 2022, "CR Muhit, CR Marjia, CR Shahed", 5.3);
        Wish wish = new Wish("Horror", 90, 2022, "Nusaa, Ajju, Gittu", 5.2);
        TheCreator theCreator = new TheCreator("Horror", 90, 2022, "Tahmid, Sama Mama, Sourav", 5.3);

        theNun2.display();
        System.out.println();
        wish.display();
        System.out.println();
        theCreator.display();
    }
}