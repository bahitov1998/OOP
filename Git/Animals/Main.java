package Animals;

public class Main {
    public static void main(String[] args) {

    Cat barsik = new Cat("Барсик", 5, 4);
    String barsikName = barsik.getName();
    int barsikAge = barsik.getAge();
    barsik.setWeight(123);

       System.out.println("Имя кота: " + barsikName);
       System.out.println("Возраст кота: " + barsikAge);
       System.out.println("Вес кота: " + barsik.getWeight());
}
}
