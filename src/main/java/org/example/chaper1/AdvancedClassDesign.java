package org.example.chaper1;

import org.example.PublicInterFace;
import org.example.TestsInterFace;
import org.example.User;

public class AdvancedClassDesign {


    /** @ important
     * Using volatile is yet another way (like synchronized, atomic wrapper) of making class thread-safe .
      */




    static int x;
    int y;
    private int z;

    static int var;


    /**
     * @ Compile Error
     * <p>
     * abstract static int x;
     * abstract  final  int x;
     */


    public static void main(String[] args) {

        InnerEnum  innerEnums =InnerEnum.valueOf("cAPITAL");

        AnynymousClass anynymousClass  = new AnynymousClass() {

            @Override
            String test() {
                var+=5;
                System.out.println(var);
                return "";
            }
        };

    }

   static abstract class AnynymousClass extends User implements PublicInterFace, TestsInterFace {
        int x =0;
       abstract String test();
    }

    void method1() {
        /** @ Compile Error
         * static int x ; static not foo local variable
         */


    }

    void Method2() {

        /**
         * can accuse just variable of parent class that final of effs final
         */
        int x = 0;
        class LocalInnerClass extends User implements PublicInterFace, TestsInterFace {
            void localMethod() {
                int y = 8;
                y += 9;
                System.out.println(y);
            }

        }
    }


    abstract class MemberInnerClas {
        /**
         * @info cannot declare any static variable or method // Compile Error
         * static int x =0;
         * can we initialize it by using just this declares
         * can access any variable for parent class
         * can declare final and protected and private
         * can be abstract
         * can-declare any type on constructor
         * @in static filed
         * MemberInnerClas =new MemberInnerClas(); compiles error
         * <p>
         * AdvancedClassDesign.MemberInnerClas = new AdvancedClassDesign().new MemberInnerClas(); this correct
         * @in none static method
         * MemberInnerClas= new MemberInnerClas(); correct
         * AdvancedClassDesign.MemberInnerClas = new AdvancedClassDesign().new MemberInnerClas(); this correct
         */


        int x = 0;
        final private int meb = 0;

        abstract void testInnerMethod();


        private MemberInnerClas() {

        }

        public MemberInnerClas(String x) {

        }


        void testMember() {
            x = 6 + 6;
            System.out.println(x + z + y + this.x);

        }
    }

    static class StaticClass extends User implements PublicInterFace, TestsInterFace {
        private final static int x = 0;
        static int y = 0;


        /**
         * @info can be abstract
         * can have any access modifier
         * can declare static method and static variable
         * can access just-static variable of parent class be a
         * <p>
         * can inti by
         * StaticClass staticClass = new StaticClass();
         * AdvancedClassDesign.StaticClass staticClass1 = new AdvancedClassDesign. StaticClass();
         */

        static void StaticInnerClassMethod() {
            System.out.println(y++);
            y += 2;

            System.out.println(var);
        }

    }


    @Override
    public boolean equals(Object obj) {
        /**
         * It is reflexive: For any non‐null reference value x, x.equals(x) should return true.
         * ■ It is symmetric: For any non‐null reference values x and y, x.equals(y) should return
         * true if and only if y.equals(x) returns true.
         * ■ It is transitive: For any non‐null reference values x, y, and z, if x.equals(y) returns
         * true and y.equals(z) returns true, then x.equals(z) should return true.
         * ■ It is consistent: For any non‐null reference values x and y, multiple invocations of
         * x.equals(y) consistently return true or consistently return false, provided no
         * information used in equals comparisons on the objects is modified.
         * ■ For any non‐null reference value x, x.equals(null) should return false
         */

        return false;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /****************************************************************************@Emun**************************************************************************/


    public  enum InnerEnum{

        /**
         * the constructor must be private
         * if you write any things after emun values you must add ';' semicolon
         * the first thing must be written in emun is emun values
         * emun can declare just static method
         */
        CAPITAL{
            @Override
            void emunMethod() {
            int x=0;
          ///  static int  y =0; compile error
                System.out.println(x);
            }
        },SMALL{
            @Override
            void emunMethod() {

            }
        }, MEDIUM{
            @Override
            void emunMethod() {

            }
        },BIG{
            @Override
            void emunMethod() {

            }

            @Override
            void metod3() {
                System.out.println("test");
            }
        };

         InnerEnum(int x){

        }
         InnerEnum(){

        }


        abstract void emunMethod();

         static void emunMethod2(){

         }

         void metod3(){
             System.out.println("inside method 3");
         }





    }

}

