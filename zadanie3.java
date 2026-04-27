class Pojazd {
  String marka = "Generyczna";
}

// TODO: Użyj odpowiedniego słowa kluczowego, aby dziedziczyć po Pojazd
class Samochod extends Pojazd {
  int liczbaDrzwi = 5;
}

public class Main {
  public static void main(String[] args) {
    Samochod mojSamochod = new Samochod();

    // Samochód ma dostęp do pola z klasy Pojazd
    System.out.println("Marka: " + mojSamochod.marka);
    System.out.println("Liczba drzwi: " + mojSamochod.liczbaDrzwi);
  }
}
