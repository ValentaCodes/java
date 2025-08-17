package StringOptions;

public class Main {

    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        //The concat method on this String object will be ignored unless we assign it to a variable
        //These methods dont change the internals of the existing String object.
        //Instead a new String was created by the method call in the heap memory
        helloWorld.concat(" and Goodbye");

        //Note you can't assign a string literal to a StringBuilder object
//      StringBuilder helloWorldBuilder = "Hello" + "World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        //Unlike Strings we can call methods without assigning them to a new variable since StringBuilder is
        // self-referenced
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
