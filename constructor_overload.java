class Student{
    String name="";
    int age=0;
    int roll=0;
    Student(String name){
        this.name=name;
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    Student(String name, int age, int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }
    void display(){
        System.out.println("\n---Student's details---");
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll Number : "+roll);
    }
    public static void main(String args[]){
    Student s1=new Student("Shreya");
    s1.display();

    Student s2=new Student("Jiya",20);
    s2.display();

    Student s3=new Student("Naman",20,5);
    s3.display();
    }
}