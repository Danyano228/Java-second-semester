public class Task1 {

    private enum Seasons {
        Winter (-14),
        Spring (10),
        Summer (20) {
            public String getDescription() {
                return "Теплое время года";
            }
        },
        Autumn (8);

        public final int temperature;
        private Seasons(int temperature) {
            this.temperature = temperature;
        }

        public int getTemperature() {
            return temperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }


    }

    private void report(Seasons season) {
        switch (season) {
            case Winter -> System.out.println("Я люблю зиму!");
            case Spring -> System.out.println("Я люблю весну!");
            case Summer -> System.out.println("Я люблю лето!");
            case Autumn -> System.out.println("Я люблю осень!");
        }
    }

    public Task1() {
        Seasons my_season = Seasons.Summer;
        report(my_season);
        System.out.println(my_season.getDescription() + "\n");


        for (Seasons season: Seasons.values()) {
            System.out.printf("Время года: %s%nСредняя температура: %d%nОписание: %s",
                    season, season.getTemperature(), season.getDescription());
            if (season != season.values()[3]) System.out.println("\n");
        }
    }

}
