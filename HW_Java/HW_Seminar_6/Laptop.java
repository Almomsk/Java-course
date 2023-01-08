package HW_Java.HW_Seminar_6;

 import java.util.ArrayList;
 import java.util.HashSet;
 import java.util.List;
 import java.util.Scanner;
 import java.util.Set;
 
 public class Laptop {

     private List<Brand> brands;

     private String model;
     private float diagonal;
     private String screenResolution;
     private boolean dvdRom;
     private int hardDisk;
     private String operativeMemory;
     private String operatingSystem;
     private String color;

     public Laptop() {
     }
     public Laptop(String model, float diagonal, String screenResolution, boolean dvdRom, int hardDisk,
             String operativeMemory, String operatingSystem, String color) {
         this.brands = new ArrayList<>();
         this.model = model;
         this.diagonal = diagonal;
         this.screenResolution = screenResolution;
         this.dvdRom = dvdRom;
         this.hardDisk = hardDisk;
         this.operativeMemory = operativeMemory;
         this.operatingSystem = operatingSystem;
         this.color = color;
     }

     public String getModel() {return model;}
     public float getDiagonal() {return diagonal;}
     public String getScreenResolution() {return screenResolution;}
     public boolean isDvdRom() {return dvdRom;}
     public int getHardDisk() {return hardDisk;}
     public String getOperativeMemory() {return operativeMemory;}
     public String getOperatingSystem() {return operatingSystem;}
     public String getColor() {return color;}
     public void addBrand(Brand brand) {
         brands.add(brand);
     }

     public List<Laptop> filter(Set<Laptop> laptop) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Hello, please specify parameters for a laptop you would like to have." +
                 "\nPlease enter HDD size in gigabytes\nIn stock : 300,500,600,700,1000");
         String enterHardDisk = scan.nextLine();
         int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
         System.out.println("Please enter the amount of RAM in GB\nIn stock : 4, 8, 16");
         String enterOperativeMemory = scan.nextLine();
         System.out.println("Please select operating system\nIn stock : Linux, ios, Windows");
         String enterOperatingSystem = scan.nextLine();
         System.out.println("Please enter laptop color\nIn stock : black, white");
         String enterColor = scan.nextLine();
 
         List<Laptop> listLaptop = new ArrayList<>();
         for (Laptop tempLaptop : laptop) {
             if (intParseEnterHardDisk == tempLaptop.hardDisk) {
                 if (enterOperativeMemory.equals(tempLaptop.operativeMemory)) {
                     if (enterOperatingSystem.equals(tempLaptop.operatingSystem)) {
                         if (enterColor.equals(tempLaptop.color)) {
                             listLaptop.add(tempLaptop);
                         }
                     }
                 }
             }
         }
         return listLaptop;
     }
 
     public Set<Laptop> newFilter(Set<Laptop> laptop) {
         Scanner scan = new Scanner(System.in);
         Set<Laptop> listLaptop = new HashSet<>(laptop);
 
         System.out.println("Hello, please indicate the number or numbers of laptop filtering criteria," + 
         "\n1. HDD size\n2. DDR Size\n3. Operating system\n4. Laptop Color");
         String userRequest = scan.nextLine();
             
         for (int i = 0; i < userRequest.length(); i++) {
             if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                 System.out.println("Please enter HDD size in gigabytes\nIn stock : 300,500,600,700,1000");
                 String enterHardDisk = scan.nextLine();
                 int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                 for (Laptop tempLaptop : laptop) {
                     if (intParseEnterHardDisk != tempLaptop.hardDisk){ 
                         listLaptop.remove(tempLaptop);
                     }
                 }          
             }
             
             if(2 == Character.getNumericValue(userRequest.charAt(i))){
                 System.out.println("Please enter the amount of RAM in GB\nIn stock : 4, 8, 16");
                 String enterOperativeMemory = scan.nextLine();
                 for (Laptop tempLaptop : laptop) {
                     if ((enterOperativeMemory.equals(tempLaptop.operativeMemory)) == false) {
                         listLaptop.remove(tempLaptop);
                     }
                 }
             }   
 
             if(3 == Character.getNumericValue(userRequest.charAt(i))){
                 System.out.println("Please select operating system\nIn stock : Linux, ios, Windows");
                 String enterOperatingSystem = scan.nextLine();
                 for (Laptop tempLaptop : laptop) {
                     if ((enterOperatingSystem.equals(tempLaptop.operatingSystem) == false)) {
                         listLaptop.remove(tempLaptop);
                     }
                 }
             }
         
             if(4 == Character.getNumericValue(userRequest.charAt(i))){
                 System.out.println("Please enter laptop color\nIn stock : black, white");
                 String enterColor = scan.nextLine();
                 for (Laptop tempLaptop : laptop) {
                     if ((enterColor.equals(tempLaptop.color)) == false) {
                         listLaptop.remove(tempLaptop);
                     }
                 }
             }
         }
         return listLaptop;
     }
 

     @Override
     public String toString() {
         return "\nLaptop  ->  " + model + "\nbrands = " + brands + ",\ndiagonal = " + diagonal + ",\nscreenResolution = "
                 + screenResolution
                 + ",\ndvdRom = " + dvdRom + ",\nhardDisk = " + hardDisk + ",\noperativeMemory = " + operativeMemory
                 + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
     }
 
 }