 class city {
     public String name;
     public long population; //variables

     public void display()  //methods
     {
         System.out.println("city name: " + name);
         System.out.println("Population is :" + population);
     }


         public static void main(String args[]) {
             city m1 = new city(); //creating objects
             city m2 = new city();
             m1.name = "chennai";
             m1.population = 2000000;
             System.out.println("Details of m1:");

             m1.display();
             m2.name = "kochi";
             m2.population = 1000000;
             System.out.println("Details of m2: ");
             m2.display();
         }

     }



