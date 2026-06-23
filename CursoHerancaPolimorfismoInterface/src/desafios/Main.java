import desafios.ex01.Scholarship;
import desafios.ex01.Student;
import desafios.ex02.OtherStudent;
import desafios.ex02.Teacher;
import desafios.ex03.Book;
import desafios.ex03.Ebook;
import desafios.ex03.Magazine;
import desafios.ex04.Email;
import desafios.ex04.Notification;
import desafios.ex04.Push;
import desafios.ex04.SMS;
import desafios.ex05.CreditCard;
import desafios.ex05.Payment;
import desafios.ex05.Pix;
import desafios.ex05.Ticket;
import desafios.ex06.NotificationPerson;
import desafios.ex07.Reservation;
import desafios.ex07.VipReservation;
import desafios.ex08.Report;
import desafios.ex09.BankOperation;
import desafios.ex09.Deposit;
import desafios.ex09.Withdrawal;
import desafios.ex10.AirConditioning;
import desafios.ex10.Light;

void main() {
    // Ex01
    Student student1 = new Student(
            "Fernada",
            "Regular");
    Scholarship student2 = new Scholarship(
            "Lucas");

    student1.identify();
    student2.identify();

    // Ex02
    OtherStudent student3 = new OtherStudent(
            "Carlos",
            21,
            9.0);
    OtherStudent student4 = new OtherStudent(
            "José",
            22,
            8.0);

    Teacher teacher1 = new Teacher(
            "Marta",
            40,
            "Matemática");
    Teacher teacher2 = new Teacher(
            "Roberto",
            38,
            "História");

    student3.displayInfo();
    student4.displayInfo();

    teacher1.displayInfo();
    teacher2.displayInfo();

    // Ex03
    Book book = new Book(
            "O Guia do Mochileiro das Galáxias",
            1979,
            "Douglas Adams");
    Magazine magazine = new Magazine(
            "National Geographic",
            2023,
            245);
    Ebook ebook = new Ebook(
            "Clean Code",
            2008,
            "PDF");

    book.displayInfo();
    magazine.displayInfo();
    ebook.displayInfo();

    // Ex04
    Notification email = new Email(
            "cliente@exemplo.com",
            "Aproveite nossos descontos esta semana.",
            "Promoção especial!");

    Notification sms = new SMS(
            "(11) 98765-4321",
            "Sua fatura foi paga com sucesso.");

    Notification push = new Push(
            "usuario_app",
            "Você tem uma nova mensagem não lida.",
            "Novidade!");

    email.send();
    sms.send();
    push.send();

    // Ex05
    Payment card = new CreditCard(250.00);
    Payment ticket = new Ticket(500.00);
    Payment pix = new Pix(300.00);

    card.confirmPayment();
    ticket.confirmPayment();
    pix.confirmPayment();

    // Ex06
    NotificationPerson notificationPerson = new NotificationPerson();

    notificationPerson.sendMessage("Olá!");
    notificationPerson.sendMessage("João", "Bom dia!");
    notificationPerson.sendMessage("Maria", "Atenção!", 2);

    // Ex07
    Reservation r = new Reservation();
    r.reserve();
    r.reserve("10/04");
    r.reserve("12/04", 4);

    VipReservation vip = new VipReservation();
    vip.reserve();

    // Ex08
    Report report = new Report("Relatório 2025",
            "Tudo funcionando conforme esperado.");
    report.print();

    // Ex09
    BankOperation deposit = new Deposit(200.0);
    BankOperation withdrawal = new Withdrawal(50.5);

    deposit.execute();
    withdrawal.execute();

    // Ex10
    Light light = new Light();
    AirConditioning airConditioning = new AirConditioning();

    light.call();
    light.call();
    light.turnOff();
    light.turnOff();

    airConditioning.turnOff();
}