package desafios.ex07;

public class Reservation {

    public void reserve() {
        System.out.println("\nReserva realizada!");
    }

    public void reserve(String date) {
        System.out.println("Reserva feita para o dia " + date);
    }

    public void reserve(String date, Integer quantityPerson) {
        System.out.println("Reserva feita para o dia " + date + " para " + quantityPerson + " pessoas");
    }
}