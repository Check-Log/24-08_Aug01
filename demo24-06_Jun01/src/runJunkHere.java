import A_Basics.*;
import A_Principles.SOLID_Principles;
import P01.Practice03;
import P01.Practice05;
import P01.Practice06;
import P02.*;
import P2409_Sep02.Multithread;
import P2409_Sep.P01_MultiThreading;
import P2409_Sep03.Login;
import P2409_Sep04.P2409_04_Script;
import P2409_Sep05.P2409_05_Script;

public class runJunkHere {



    public static void main(String[] args)
    {
        P2409_05_Script p240905 = new P2409_05_Script();
        p240905.commence(); //multithreading with super class extensions

        P2409_04_Script p2409_04_script = new P2409_04_Script();
        //p2409_04_script.commence();

        Login login01 = new Login();
        //login01.run01();

        P01_MultiThreading mT01 = new P01_MultiThreading();
        //mT01.run();

        Multithread m2 = new Multithread();
        //m2.run();

        Practical02_31 p31 = new Practical02_31();
        //p31.run();
        BTDigital_Aug28_01 bt1 = new BTDigital_Aug28_01();
        //bt1.run();
        BTDigital_Aug28_02 bt2 = new BTDigital_Aug28_02();
        //bt2.run();

        Practical02_30 p30 = new Practical02_30();
        //p30.run();

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
        Iteration01_Basic i1 = new Iteration01_Basic();
        //i1.run();

        //---------------------------------------------------------
        Iteration02_Advanced01 i2 = new Iteration02_Advanced01();
        //i2.run();

        //---------------------------------------------------------
        Iteration02_Advanced02 i3 = new Iteration02_Advanced02();
        //i3.run();
        CoderByte coderByte = new CoderByte();

        Iteration02_Advanced02 i4 = new Iteration02_Advanced02();
        //i4.run02();
        //i4.run03();





    }
}