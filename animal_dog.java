class animal{
    String name;
    int age;
public void setName(String name){
this.name=name;
}
public String getName(){
    return name;
}
public void setAge(int age){
    this.age=age;
}
public int getAge(){
return age;
}
    
}
class Dog extends animal{
String voice;

public void setVoice(String voice){
    this.voice=voice;
}
public String getVoice(){
    return voice;
}

}
public class animal_dog {
    public static void main(String[] args) {
        animal  a= new animal();
        Dog b= new Dog();
        a.setName("Waaghya");
        System.out.println(a.getName());
        a.setAge(3);
        System.out.println(a.getAge());

        b.setVoice("Brking");
        System.out.println(b.getVoice());
        b.setName("chingu");
        System.out.println(b.getName());


    
    }
}
