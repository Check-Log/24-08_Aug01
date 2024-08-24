import A_Basics.*;
import A_Principles.SOLID_Principles;
import Practicals01.Practice03;
import Practicals01.Practice05;
import Practicals01.Practice06;
import Practicals02.*;

public class runJunkHere {


    public static void main(String[] args)
    {
        Practical02_30 p30 = new Practical02_30();
        p30.run();

        Practical02_29 p29 = new Practical02_29();
        //p29.run();

        Practical02_28 p28 = new Practical02_28();
        //p28.run();

        PA_Practical01 pa_practical01 = new PA_Practical01();
        //pa_practical01.run();

        PA_Practical02 pa_practical02 = new PA_Practical02();
        //pa_practical02.run();

        MultiThread01 m1 = new MultiThread01();
        //m1.run();

        Practical02_26 p26 = new Practical02_26();
        //p26.run();

        Practical02_25 p25 = new Practical02_25();
        //p25.run();

        ESO_02 es2 = new ESO_02();
        //es2.run();

        ESO_01 es1 = new ESO_01();
        //es1.run();

        Practical02_22 p22 = new Practical02_22();
        //p22.run();


        Practical02_21 p21 = new Practical02_21();
        //p21.run();

        Practical02_20 p20 = new Practical02_20();
        //p20.run();

        Practical02_18 p18 = new Practical02_18();
        //p18.run();

        Practical02_17 p17 = new Practical02_17();
        //p17.run();

        Practical02_16 p16 = new Practical02_16();
        //p16.run();

        Practical02_15 p15 = new Practical02_15();
        //p15.run();

        Practical02_14 p14 = new Practical02_14();
        //p14.run();

        Practical02_13 p13 = new Practical02_13();
        //p13.run();

        Practical02_12 p12 = new Practical02_12();
        //p12.run();


        Practice06 p6 = new Practice06();
        //p6.run();

        Practice05 p5 = new Practice05();
        //p5.run();

        /*
        Practicals01.Practice04 p4 = new Practicals01.Practice04();
        try {
            p4.run();
        }catch(IOException ex){
            System.out.println(ex);
        };
*/

        Practice03 p3 = new Practice03();
        //p3.run();


        //Practice02 p2 = new Practice02();
        //p2.run();

        //------------------------------------
        //Object Types, initialisation
        //Methods can only accept raw data from a primitive-type
        //ArrayList and Map are not primitive, hence you can't pass them as raw data, it has to be an object
        BasicObjectInitialisation o1 = new BasicObjectInitialisation();
        //o1.run();

        //------------------------------------------------
        //Logic techniques:
        //switch case, idle, social, attacking,
        LogicTechniques l1 = new LogicTechniques();
        //l1.run();

        //---------------------------------------
        //Single Responsibility
        SOLID_Principles singleResponsibility = new SOLID_Principles();
        //singleResponsibility.run();
        //------------------------------------------------------------------------------
        //Iterator techniques,
        IteratorTechniquesBasic i1 = new IteratorTechniquesBasic();
        //i1.run();

        //---------------------------------------------------------
        IteratorTechniques_Advanced01 i2 = new IteratorTechniques_Advanced01();
        //i2.run();

        //---------------------------------------------------------
        IteratorTechniques_Advanced02 i3 = new IteratorTechniques_Advanced02();
        //i3.run();
        CoderByte coderByte = new CoderByte();

        IteratorTechniques_Advanced02 i4 = new IteratorTechniques_Advanced02();
        //i4.run02();
        //i4.run03();





    }
}