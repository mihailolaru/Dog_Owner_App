package house;

public class Main {
    public static void main(String[] args) {

        dog Dog = new dog("Pitrushka", 1000*1, 365*1.6);
        owner Owner = new owner("Ion Petru", 1000*80, 365*20);

        while(Owner.food!=80){
         Dog.eat(Owner.getFood(200));
         System.out.println(Dog);
         System.out.println(Owner);
        }

    }
}

   /*   1. на какое количество дней хватит еды щенку?
        2. на сколько килограммов увеличился вес щенка после окончания периода кормления?
        3. сколько полных лет будет (целое число!!!) владельцу и щенку в конце периода кормления?

        ! правильным результатом для изложенных выше условий было бы:
        400 дней
        0.8kg
        21 и 3 года соответственно*/