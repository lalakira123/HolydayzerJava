public class Holydays {
    Holyday[] holydays;

    public Holydays(Holyday[] holydays) {
      this.holydays = holydays;
    }

    void isHoliday(String date) {
      boolean hasHolyday = false;

      for (int i = 0; i < holydays.length; i++) {
        Holyday holyday = holydays[i];

        if ( holyday.getDate().equals(date) ) {
          System.out.println("Existe Feriado: " + holyday.getName() + " - " + holyday.getDate());
          hasHolyday = true;
        } 
      }   

      if (!hasHolyday) {
          System.out.println("Esta data não é um feriado!");
      }
    }

    void getHolydays() {
        System.out.println("-----------Lista de Feriados----------");

        for (int i = 0; i < holydays.length; i++) {
          Holyday holyday = holydays[i];
          System.out.println(holyday.getName() + " => " + holyday.getDate());
        }
    }
}
