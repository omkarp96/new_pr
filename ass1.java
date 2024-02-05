
class ClassAndDivisions {
    public static void main(String[] args) {
        int classNumber = 11;
        String className = "Class";
        int numberOfDivisions = 12;
        System.out.println(className + " " + classNumber + " with " + numberOfDivisions + " divisions:");

        for (int division = 1; division <= numberOfDivisions; division++) {
            System.out.println("Division " + division);
        }
    }
}

