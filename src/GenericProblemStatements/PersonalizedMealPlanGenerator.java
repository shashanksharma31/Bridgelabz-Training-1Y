package GenericProblemStatements;
import java.util.*;
interface MealPlan{
    String getName();
}
class VegetarianMeal implements MealPlan{
    String name;
    VegetarianMeal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class VeganMeal implements MealPlan{
    String name;
    VeganMeal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class KetoMeal implements MealPlan{
    String name;
    KetoMeal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class HighProteinMeal implements MealPlan{
    String name;
    HighProteinMeal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Meal<T extends MealPlan>{
    T meal;
    Meal(T meal){
        this.meal=meal;
    }
    void display(){
        System.out.println(meal.getName());
    }
}
class MealUtil{
    static <T extends MealPlan> void generateMeal(T meal){
        System.out.println("Meal: "+meal.getName());
    }
}
public class PersonalizedMealPlanGenerator{
    public static void main(String[] args){
        Meal<VegetarianMeal> m1=new Meal<>(new VegetarianMeal("Veg Thali"));
        m1.display();
        MealUtil.generateMeal(new VeganMeal("Vegan Salad"));
        MealUtil.generateMeal(new KetoMeal("Keto Diet"));
        MealUtil.generateMeal(new HighProteinMeal("Protein Shake"));
    }
}