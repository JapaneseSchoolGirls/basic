public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length of side A: ");
    double A = scanner.nextDouble();

    System.out.print("Enter the length of side B: ");
    double B = scanner.nextDouble();

    System.out.print("Enter the length of side C: ");
    double C = scanner.nextDouble();

    double s = (A + B + C) / 2;
    double area = Math.sqrt(s * (s - A) * (s - B) * (s - C));

    System.out.println("The area of the triangle is: " + area);

    scanner.close();
}
