package desafios.ex07;

public class VipReservation extends Reservation {
    @Override
    public void reserve() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo\n");
    }
}