   public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the lengths of the three sides
        System.out.print("Enter the length of side A: ");
        
        
        double A = scanner.nextDouble();
        
        
        System.out.print("Enter the length of side B: ");
        
        
        double B = scanner.nextDouble();
        
        
        System.out.print("Enter the length of side C: ");
        
        double C = scanner.nextDouble();
        
        

        // Calculate the semi-perimeter (s)
        double s = (A + B + C) / 2;

        // Calculate the area using Heron's Formula
        double area = Math.sqrt(s * (s - A) * (s - B) * (s - C));

        // Output the area
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }