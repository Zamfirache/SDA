package creational.builder;

public class MainBuilder {


    public static void main(String[] args) {

//        StringBuilder stringBuilder = new StringBuilder();  // E MUTABIL
//
//        stringBuilder.append("Ana ")
//                .append("are ")
//                .append("mere")
//                .append("si")
//                .append("pere");
//
//
//        String s = new String("Ana are mere si pere"); // Stringul e imutabil!!!
//
//        System.out.println(stringBuilder);
//
//       // System.out.println(stringBuilder.toString());

        User user = new User.Builder()
                .setName("Ion")
                .setEmail("ion.popescu@yahoo.com")
                .setSalary(3400)
                .build();


        User user2 = new User.Builder()
                .setName("Mircea")
                .build();

    }
}
