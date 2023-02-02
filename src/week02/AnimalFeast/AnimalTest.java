package week02.AnimalFeast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnimalTest {

    public static void main(String[] args) {


      Animal animal1=new Animal("great blue heron","garlic naan");
      Animal animal2=new Animal("chickadee","chocolate cake");
      Animal animal3=new Animal("horse","donut");
      Animal animal4=new Animal("Duck","Donuk");

      List<Animal>animals=new ArrayList<>();
      animals.addAll(Arrays.asList(animal1,animal2,animal3,animal4));

      Predicate<Animal> predicate;
        predicate = p->{
            boolean b = p.getName().charAt(0) == p.getDishes().charAt(0) &&
                    p.getName().charAt(p.getName().length() - 1) ==
                            p.getDishes().charAt(p.getDishes().length() - 1);
            return b;
        };
        checkAnimal(animals,predicate);



    }


    private static void checkAnimal(List<Animal>animalList,Predicate predicate) {

        for (Animal eachAnimal:animalList){
          if (predicate.test(eachAnimal)){
              System.out.println(eachAnimal.getName().toUpperCase()+" can bring "+"" +
                      "'"+eachAnimal.getDishes().toUpperCase()+"'");
          }else {
              System.err.println(eachAnimal.getName().toUpperCase()+" can not bring "+"" +
                      "'"+eachAnimal.getDishes().toUpperCase()+"'");          }
        }

    }
}
