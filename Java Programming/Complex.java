public class Complex {
    int real;
    int imaginary;

    Complex(int r, int i){
        real=r;
        imaginary=i;
    }
    void print(){
        System.out.println(real+"+"+imaginary+"i");
    }
    Complex add(Complex y){
        int sumReal = real+y.real;
        int imagReal = imaginary+y.imaginary;
        Complex res = new Complex(sumReal, imagReal);
        return res;
    }
}

class Main{
    public static void main(String[] args){
        Complex x = new Complex(2,3);
        x.print();
        Complex y = new Complex(-5,4);
        y.print();

        Complex z = x.add(y);
        z.print();
    }
}
