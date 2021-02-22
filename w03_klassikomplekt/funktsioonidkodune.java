
     public class funktsioonidkodune {

         public static void main (String[] args) {

             final int veeretusi = 1000, kogus = 7;
             int total, count = 0;

             klassidkodune3 dice = new klassidkodune3();

             for (int veeretus=1; veeretus <= veeretusi; veeretus++) {
                 total = dice.veeretus();
                 if (total == kogus)
                     count++;
             }
             System.out.println ("Veeretusi: " + veeretusi);
             System.out.println ("Mitu 12 silmaga veeretust tuli: " + count);
         }
     }