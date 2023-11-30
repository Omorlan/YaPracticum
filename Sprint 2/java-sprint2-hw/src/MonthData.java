class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        System.out.println("|-------------------|");
        System.out.printf("| %-4s | %-10s |\n", "День", "Шаги");
        System.out.println("|------|------------|");
        for (int i = 0; i < days.length; i++) {
            System.out.printf("| %-4d | %-10d |\n",i+1,days[i]);
            System.out.println("|------|------------|");
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;

        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }

} 