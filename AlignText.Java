package week3;


public class AlignText {

    public static void main(String[] args) {
        int[] classCodes = {2545, 2505, 2560};
        String[] classNames = {"Java", "C#", "Web"};
        double[] averageClassSizes = {22.34, 17.42, 14.23};

        String templateString = "%-10s%-10s%-10s\n";
        System.out.printf(templateString, "Code", "Name", "Average Size");

        String tableTemplateString = "%-10d%-10s%-10.2f\n";
        for (int i = 0; i < classCodes.length; i++) {
            int code = classCodes[i];
            String name = classNames[i];
            double averageClassSize = averageClassSizes[i];

            System.out.printf(tableTemplateString, code, name, averageClassSize);
        }
    }
}
