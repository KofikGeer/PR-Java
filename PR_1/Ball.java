public class Ball {
        private String color;
        private double radius;
        private int mass;

        public Ball(String c, double r, int m){
            color = c;
            radius = r;
            mass = m;
        }
        public Ball(){
            color = "white";
            radius = 1;
            mass = 1;
        }
        public void setColor(String c) {
            this.color = c;
        }
        public void setRadius(double r) {
            this.radius = r;
        }
        public void setMass(int m) {
            this.mass = m;
        }
        public String getColor(){
            return color;
        }
        public double getRadius() {
            return radius;
        }
        public double getMass() {
            return mass;
        }
        public String toString(){
            return "Ball`s color is "+this.color+", and radius is "+this.radius;
        }
        public void ballGravity(){
            System.out.println("Ball's gravity is "+mass*10+" Newton");
        }

}
