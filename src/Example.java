import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Cat mycat = new Cat("Long" ,21);
        Constructor constructor = Cat.class.getConstructor(String.class, Integer.class);
        Object cat = constructor.newInstance("ChiBao", 12);
        System.out.println(cat);
    }
}
class Cat{
    private String name;
    private Integer age = 11;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");
    }
    private void eat(){
        System.out.println("Eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}