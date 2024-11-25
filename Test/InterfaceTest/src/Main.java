interface A{
    void show();
}

interface B{
    void display();
}

interface C{
    void print();
}

public class Main implements A, B, C{
    public void show(){
        System.out.println("Show method of A");
    }

    public void display(){
        System.out.println("Display method of B");
    }

    public void print(){
        System.out.println("Print method of C");
    }

    public static void main(String[] args){
        A obj = new Main();
        obj.show();
        ((B)obj).display();
        ((C)obj).print();
    }
}