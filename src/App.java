public class App {
    public static void main(String[] args) throws Exception {
        Holyday[] holydays = {
            new Holyday("Confraternização mundial", "01/01/2023"),
            new Holyday("Carnaval", "21/02/2023"),
            new Holyday("Páscoa", "17/04/2023"),
            new Holyday("Tiradentes", "21/01/2023"),
            new Holyday("Dia do Trabalho", "01/05/2023"),
            new Holyday("Corpus Christi", "08/06/2023"),
            new Holyday("Independência do Brasil", "07/09/2023"),
            new Holyday("Nossa Senhora Aparecida", "12/10/2023"),
            new Holyday("Finados", "02/11/2023"),
            new Holyday("Proclamação da República", "15/11/2023"),
            new Holyday("Proclamação da República", "25/12/2023"),
        };

        Holydays listHolydays = new Holydays(holydays);

        listHolydays.isHoliday("01/01/2023");
        listHolydays.getHolydays();
    }
}
