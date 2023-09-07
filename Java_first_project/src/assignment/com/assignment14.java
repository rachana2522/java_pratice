//Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument
package assignment.com;
abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Glockenspiel");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Glockenspiel");
    }
}

class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Violin");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Violin");
    }
}

public class assignment14 {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();
        
        glockenspiel.play();
        glockenspiel.tune();
        
        violin.play();
        violin.tune();
    }
}
