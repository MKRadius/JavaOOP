public class AgeDistribution {
    public static void main(String[] args) {
        final int samples = 1000;
        
        int ageDistribution[][] = {
            {23, 20},
            {50, 25},
            {69, 30},
            {84, 35},
            {96, 40},
            {100, 50}
        };

        int generatedAges[] = new int[51]; // 18-50

        for (int i = 0; i < samples; i++) {
            int randNum = (int) (Math.random()*100 + 1);
            int j = 0;

            while (randNum > ageDistribution[j][0]) {
                j++;
            }

            generatedAges[ageDistribution[j][1]]++;
        }

        System.out.println("Age range     Count         Percentage");
        int prevRange = 18;
        for (int age = 18; age <= 50; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-1d-%-10d %-13d %-8.2f\n";
                System.out.printf(str, prevRange, age, generatedAges[age], ((double)generatedAges[age])/1000*100 );
                prevRange = age + 1;
            }
        }
    }
}
