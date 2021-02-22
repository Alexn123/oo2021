
  public class klassidkodune3 {

        private klassidkodune2 t2ring1, t2ring2;
        private int v22rtus1, v22rtus2, kokku;

       public klassidkodune3 () {
            t2ring1 = new klassidkodune2();
            t2ring2 = new klassidkodune2();
            v22rtus1 = 1;
            v22rtus2 = 1;
            kokku = v22rtus1 + v22rtus2;
        }

        public int veeretus () {
             v22rtus1 = t2ring1.veeretus();
             v22rtus2 = t2ring2.veeretus();
             kokku = v22rtus1 + v22rtus2;
             return kokku;

        }

        public int getKokku () {
             return kokku;
        }

        public int getT2ring1 () {
            return v22rtus1;
        }

        public int getT2ring2 () {
            return v22rtus2;
        }
 }