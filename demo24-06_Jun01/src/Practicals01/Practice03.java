package Practicals01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice03 {

    public void run(){
        System.out.println("------------------------------");
        //okay, next lets talk about streams
        //Start by creating a list cast as an arraylist
        List critters = new ArrayList();
        critters.add("Bobby Bearhug");
        critters.add("Crafty Corn");
        critters.add("Hoppy Hopscotch");
        critters.add("Picky Piggy");

        List<String> critters02 = Arrays.asList( "Crafty Corn", "Bobby Bearhug", "Hoppy Hopscotch", "Picky Piggy");
        //list identify as string


        //List critters02 = Arrays.asList("Bobby Bearhug","Crafty Corn","Hoppy Hopscotch","Picky Piggy");

        //let's try adding this arrayList to a list using stream.collect(Collectors.toList)
        //List smilingCritters = Arrays.asList();
        List<String> smilingCritters = critters02.stream().collect(Collectors.toList());

        //print out using foreach list-value lambda expression
        System.out.println("smiling critters include: ");
        smilingCritters.forEach(result -> System.out.print(result + ", "));
        System.out.println();

        //let's try another stream example, this time x.stream().sorted().collect(
        //create List identifier string called list02
        List<String> list02 = smilingCritters.stream().sorted().collect(Collectors.toList());
        System.out.println("list02 contains: ");
        list02.forEach(result -> System.out.print(result + ", "));
        System.out.println("\n------------------------------------------");

        //Example 3 for stream usage stream.collect(Collectors.toList())
        List<String> list03 = Arrays.asList ("Applejack","Fluttershy","Rarity");
        //List<String> list04 = new ArrayList<>();
        //store list03 inside list04 using stream.collect(Collectors.toList)
        List<String> list04 = list03.stream().collect(Collectors.toList());
        System.out.println("using stream command and Collector library, List04 now contains:");
        //foreach of a lambda expression reuslt + " "
        list04.forEach(result -> System.out.print(result + ", "));

        //let's try command Stream.Builder
        Stream.Builder<Cherub> cherubStreamBuilder = Stream.builder();

        //build an arrayList of cherubs
        Cherub cherubList01[] = {
                new Cherub("Cletus","Human","Mediator"),
                new Cherub("Keenie","Sheep","Revenger"),
                new Cherub("Collin","Sheep","Hero")
        };

        //accept this cherub-arraylist into the cherub-streambuilder
        cherubStreamBuilder.accept(cherubList01[0]);
        cherubStreamBuilder.accept(cherubList01[1]);
        cherubStreamBuilder.accept(cherubList01[2]);

        //create the cherub stream from the cherubStreamBuilder
        System.out.println("\n ------------------------ \n I can check this stream object for cherub names: ");
        Stream<Cherub>cherubStream = cherubStreamBuilder.build();
        cherubStream.forEach(result -> System.out.print(result.name + ", "));

        //Okay now let's try a stream of type integer
        Stream<Integer> stream1a = Stream.of(2,4,3,1);
        stream1a = stream1a.sorted();

        System.out.println("\n---------------------------");
        System.out.println("stream1a has been sorted: ");
        stream1a.forEach(result -> System.out.print(result + ""));

        //Okay now let's look at Spliterator
        //first create a list, identifier string called AC_List
        List<String> AC_List = Arrays.asList("Isabelle", "Digby", "Tom Nook");

        //Spliterator i a utility used within streams, you can use it to partition sequences, usually for a heap of parallel objects
        //create a spliterator identifier String, called AC_List_spliterator
        Spliterator<String> AC_List_spliterator = AC_List.spliterator();
        System.out.println("\n--------------------------------------");
        AC_List_spliterator.forEachRemaining(result -> System.out.print(result + ", "));
/*
        //Let's try something more useful, :
        //create a new class with an arrayList
        //create a list, identifier spell, titled spells, populate it using Stream.generate.limit.collect
        List<Spell>spells = Stream.generate(()-> new Spell("Java")).limit(10).collect(Collectors.toList());

        //Now create a spliterator populated with your list
        Spliterator<Spell> spellSpliterator = spells.spliterator();

        //now use spliterator.tryAdvance and concat()
        while(spellSpliterator.tryAdvance(spell ->spell.setName(spell.getName().concat("- published by Hairy Balls"))));
        System.out.println("\n----------------------------\n Spells.getName contain the follow:");
        spells.forEach(result -> System.out.println(result.getName()));

        //trySplit technique, spliterators are always something to do with processing partitions
        //first make a new spell list
        List<Spell> spells02  = Stream.generate(()->new Spell("Cock")).limit(8).collect(Collectors.toList());

        //create splits
        Spliterator<Spell> split1 = spells02.spliterator();
        Spliterator<Spell> split2 = split1.trySplit(); //split the partition into 2 even parts

        //create spellList01
        List<Spell> spellList01 = new ArrayList<>();
        List<Spell> spellList02 = new ArrayList<>();

        split1.forEachRemaining(spellList01::add);
        split2.forEachRemaining(spellList02::add);

        System.out.println("\n-------------------------");
        System.out.println("print spellList01:");
        spellList01.forEach(result -> System.out.print(result.getName() + ", "));
        System.out.println("\nprint spellList02:");
        spellList02.forEach(result -> System.out.print(result.getName() + ", "));

*/










    }
}

