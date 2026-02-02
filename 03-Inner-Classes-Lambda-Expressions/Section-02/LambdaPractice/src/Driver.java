public class Driver {
    public static void main(String[] args) {
        
        // review and do some examples with lambdas

        // write a nice list class
        // has a method
        // transform every item
        // end users:
        // define how they want that transformation

        // class TransformableList
        // List -> Integers

        // interface Tranformer -> lambda


        // declared type 
        Transformer t1 = (e) -> {
            return e + 1;
        };


        TransformableList list = new TransformableList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.transformAll((elem) -> {
            return elem + 1;
        });


        list.transformAll(e -> e * 2);


        list.transformAll(e -> e * 2);



        System.out.println(list);


        Transformer t2 = (elem) ->{
            return elem * 3;
        };

        list.transformAll(t2);
        System.out.println(list);

        // lambda
        // becomes useful when
        // would only have a class
        // whose sole purpose is implement a single method interface



    }
}