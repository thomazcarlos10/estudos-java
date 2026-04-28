void main() {
    LocalDate purchaseDate = LocalDate.now();
    LocalDate firstInstallment = LocalDate.of(2026, 5, 27);
    LocalDate secundInstallment = firstInstallment.plusDays(30);

    if (firstInstallment.isBefore(LocalDate.now())) {
        System.out.println("Anterior ao dia do vencimento");
    } else {
        System.out.println("Superior ao dia do vencimento");
    }

    System.out.println("Data da compra: " + purchaseDate);
    System.out.println("Data da primeira parcela: " + firstInstallment);
    System.out.println("Data da segunda parcela: " + secundInstallment);

    // Formatador de data e hora
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Data da compra formatada: " + purchaseDate.format(formatter));

    // Baseado no  fuso horário
    ZonedDateTime purchaseConclusionDate = ZonedDateTime.now();
    System.out.println("Data conclusão da compra: " + purchaseDate);

    ZonedDateTime purchaseDateNy = purchaseConclusionDate.withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println("Data conclusão da compra New York: " + purchaseDateNy);

    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(17, 30);

    // Normalmente usada para fazer calculos com horas
    Duration duration = Duration.between(start, end);
    System.out.println("Duração do expediente: " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos.");

    LocalDate payment = LocalDate.parse("2026-10-30");

    // Normalmente usado para fazer calculos entre periodos de datas
    Period period = Period.between(purchaseDate, payment);
    System.out.println("Diferença: " + period.getMonths() + " meses e " + period.getDays() + " dias.");

    // Ex01
    System.out.println();
    String task = "Enviar relatório semanal";

    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();

    System.out.println("Tarefa: \"" + task + "\"");
    System.out.println("Data atual: " + currentDate);
    System.out.println("Hora atual: " + currentTime);

    // Ex02
    System.out.println();
    currentDate = LocalDate.now();
    currentTime = LocalTime.now();

    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");

    System.out.println("Data formatada: " + currentDate.format(formatterDate));
    System.out.println("Hora formatada: " + currentTime.format(formatterTime));

    // Ex03
    System.out.println();
    LocalTime startActivity = LocalTime.of(14, 30, 00);
    LocalTime endActivity = LocalTime.of(16, 45, 00);
    Duration durationActivity = Duration.between(startActivity, endActivity);

    System.out.println("Diferença de tempo: " + durationActivity.toHours() + " horas e " + durationActivity.toMinutesPart() + " minutos");

    // Ex04
    System.out.println();
    LocalDate startDate = LocalDate.of(2025, 3, 15);
    int termInDays = 15;
    LocalDate deliveryDate = startDate.plusDays(termInDays);

    System.out.println("Data de entrega: " + deliveryDate.format(formatterDate));

    // Ex05
    System.out.println();
    LocalDate expirationDate = LocalDate.of(2025, 3, 20);
    int numberMonthsDeferral = 1;
    LocalDate newExpirationDate = expirationDate.plusMonths(numberMonthsDeferral);

    System.out.println("Nova data de vencimento: " + newExpirationDate.format(formatterDate));

    // Ex06
    System.out.println();
    LocalDate eventDate = LocalDate.of(2025, 3, 10);
    currentDate = LocalDate.of(2025, 3, 15);

    System.out.println("Data do evento: " + eventDate);
    System.out.println("Data atual: " + currentDate);

    if (eventDate.isBefore(currentDate)) {
        System.out.println("O evento já ocorreu.");
    } else {
        System.out.println("O evento ainda não ocorreu.");
    }

    // Ex07
    System.out.println();
    expirationDate = LocalDate.of(2025, 3, 30);
    LocalDate reminderDate;

    if (expirationDate.getDayOfMonth() == 20) {
        reminderDate = expirationDate.minusDays(10);
        System.out.println("Data do lembrete: " + reminderDate.format(formatterDate));
    } else if (expirationDate.getDayOfMonth() == 30) {
        reminderDate = expirationDate.minusDays(5);
        System.out.println("Data do lembrete: " + reminderDate.format(formatterDate));
    } else {
        System.out.println("Data Inválida!");
    }

    // Ex08
    System.out.println();
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    ZonedDateTime zonedDateTimeTokyo = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

    System.out.println("Horário atual em Tóquio: " + zonedDateTimeTokyo.format(formatterTime));

    // Ex09
    System.out.println();
    ZonedDateTime zonedDateTimeSydney = zonedDateTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

    System.out.println("Hora atual no sistema: " + currentTime.format(formatterTime));
    System.out.println("Hora atual em Sydney: " + zonedDateTimeSydney.format(formatterTime));

    // Ex10
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatterOfficeHours = DateTimeFormatter.ofPattern("HH:mm");

    System.out.print("Digite o horário de entrada (HH:mm): ");
    LocalTime entry = LocalTime.parse(scanner.next(), formatterOfficeHours);
    System.out.print("Digite a carga horária diária (em horas): ");
    int hours = scanner.nextInt();
    System.out.print("Digite o horário real de saída (HH:mm): ");
    LocalTime exit = LocalTime.parse(scanner.next(), formatterOfficeHours);

    scanner.close();

    // Cálculo da saída prevista
    LocalTime expectedDepartureTime = entry.plusHours(hours);

    // Cálculo da diferença entre saída prevista e saída real
    Duration officeDuration = Duration.between(expectedDepartureTime, exit);
    long overtime = officeDuration.toHours();
    long extraMinutes = officeDuration.toMinutesPart();

    // Exibição dos resultados formatados
    System.out.println("Horário de entrada: " + entry);
    System.out.println("Horário de saída previsto: " + expectedDepartureTime);
    System.out.println("Horário real de saída: " + exit);

    if (overtime == 0 && extraMinutes == 0) {
        System.out.println("Saldo de horas: 0h 0min");
    } else {
        String signal;

        if (overtime > 0) {
            signal = "+";
        } else {
            signal = "-";
        }

        System.out.println("Saldo de horas: " + signal + Math.abs(overtime) + "h " + Math.abs(extraMinutes) + "min");
    }
}