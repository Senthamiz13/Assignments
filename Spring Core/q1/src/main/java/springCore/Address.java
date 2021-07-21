package springCore;

public class Address {

        ////////////////constructor/////////////////
        /// commenting constructor while using getter method//

       public Address(String street, String city, String state, int zip, String country) {
                super();
                this.street = street;
                this.city = city;
                this.state = state;
                this.zip = zip;
                this.country = country;
        }

        private String street;
        private String city;
        private String state;
        private int zip;
        private String country;

        ////getters and setters///////////

        public String getState(){ return state; }
        public void setState(String state){ this.state = state; }

        public String getStreet(){ return street; }
        public void setStreet(String street){ this.street = street; }

        public String getCity(){ return city ; }
        public void setCity(String city){ this.city  = city ; }

        public int getZip(){ return zip; }
        public void setZip(int zip){ this.zip= zip; }

        public String getCountry(){ return country; }
        public void setCountry(String country){ this.country = country; }

        public String toString(){
                return street+" "+city+" "+state+""+zip+""+country;
        }
}