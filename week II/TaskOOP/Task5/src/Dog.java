public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark(){
        if(age<=5) {
            System.out.println("hau");
        } else if (age>5 && age<10){
            System.out.println("grr HAU");
        } else if( age >10) {
            System.out.println("Hauu");
        }
    }

    public void barkAmount(int number){
        for (int i = 0; i <number-1 ; i++) {
            bark();
        }
    }
}
