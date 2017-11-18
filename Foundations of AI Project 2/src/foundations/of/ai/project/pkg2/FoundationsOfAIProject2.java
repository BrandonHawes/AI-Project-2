/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.of.ai.project.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Brandon
 */
public class FoundationsOfAIProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Delta db = new Delta();

        //inputTest(db);
        
        generateData();

    }

    public static void generateData() {

        Delta master = new Delta();

        System.out.println("ORIGINAL DATA\n");
        
        //#1
        Clause clause_1 = new Clause();
        Literal literal_1 = new Literal("~I(A)", false, false);
        clause_1.clauseList.add(literal_1);
        Literal literal_2 = new Literal("~T(A)", false, false);
        clause_1.clauseList.add(literal_2);

        //#2
        Clause clause_2 = new Clause();
        Literal literal_2_1 = new Literal("~I(A)", false, false);
        clause_2.clauseList.add(literal_2_1);
        Literal literal_2_2 = new Literal("~K(A)", false, false);
        clause_2.clauseList.add(literal_2_2);

        //#3
        Clause clause_3 = new Clause();
        Literal literal_3_1 = new Literal("~I(B)", false, false);
        clause_3.clauseList.add(literal_3_1);
        Literal literal_3_2 = new Literal("~Idea(B)", false, false);
        clause_3.clauseList.add(literal_3_2);

        //#4
        Clause clause_4 = new Clause();
        Literal literal_4_1 = new Literal("~I(B)", false, false);
        clause_4.clauseList.add(literal_4_1);
        Literal literal_4_2 = new Literal("K(C)", true, false);
        clause_4.clauseList.add(literal_4_2);

        //#5
        Clause clause_5 = new Clause();
        Literal literal_5_1 = new Literal("~I(C)", false, false);
        clause_5.clauseList.add(literal_5_1);
        Literal literal_5_2 = new Literal("I(C)", true, false);
        clause_5.clauseList.add(literal_5_2);

        //#6
        Clause clause_6 = new Clause();
        Literal literal_6_1 = new Literal("~I(C)", false, false);
        clause_6.clauseList.add(literal_6_1);
        Literal literal_6_2 = new Literal("~K(C)", false, false);
        clause_6.clauseList.add(literal_6_2);

        //#7
        Clause clause_7 = new Clause();
        Literal literal_7_1 = new Literal("~I(D)", false, false);
        clause_7.clauseList.add(literal_7_1);
        Literal literal_7_2 = new Literal("K(B)", true, false);
        clause_7.clauseList.add(literal_7_2);

        //#8
        Clause clause_8 = new Clause();
        Literal literal_8_1 = new Literal("~I(D)", false, false);
        clause_8.clauseList.add(literal_8_1);
        Literal literal_8_2 = new Literal("T(B)", true, false);
        clause_8.clauseList.add(literal_8_2);

        //#9
        Clause clause_9 = new Clause();
        Literal literal_9_1 = new Literal("F(A,D)", true, false);
        clause_9.clauseList.add(literal_9_1);

        //#10
        Clause clause_10 = new Clause();
        Literal literal_10_1 = new Literal("~F(x,y)", false, false);
        clause_10.clauseList.add(literal_10_1);
        Literal literal_10_2 = new Literal("Lunch(x,y)", true, false);
        clause_10.clauseList.add(literal_10_2);

        //#11
        Clause clause_11 = new Clause();
        Literal literal_11_1 = new Literal("~Lunch(x,y)", false, false);
        clause_11.clauseList.add(literal_11_1);
        Literal literal_11_2 = new Literal("T(x)", true, false);
        clause_11.clauseList.add(literal_11_2);

        //#12
        Clause clause_12 = new Clause();
        Literal literal_12_1 = new Literal("~Lunch(x,y)", false, false);
        clause_12.clauseList.add(literal_12_1);
        Literal literal_12_2 = new Literal("T(y)", true, false);
        clause_12.clauseList.add(literal_12_2);

        //#13
        Clause clause_13 = new Clause();
        Literal literal_13_1 = new Literal("~Like(B,C)", false, false);
        clause_13.clauseList.add(literal_13_1);

        //#14
        Clause clause_14 = new Clause();
        Literal literal_14_1 = new Literal("I(A)", true, false);
        clause_14.clauseList.add(literal_14_1);
        Literal literal_14_2 = new Literal("I(B)", true, false);
        clause_14.clauseList.add(literal_14_2);

        //#15
        Clause clause_15 = new Clause();
        Literal literal_15_1 = new Literal("I(A)", true, false);
        clause_15.clauseList.add(literal_15_1);
        Literal literal_15_2 = new Literal("I(C)", true, false);
        clause_15.clauseList.add(literal_15_2);

        //#16
        Clause clause_16 = new Clause();
        Literal literal_16_1 = new Literal("I(A)", true, false);
        clause_16.clauseList.add(literal_16_1);
        Literal literal_16_2 = new Literal("I(D)", false, false);
        clause_16.clauseList.add(literal_16_2);

        //#17
        Clause clause_17 = new Clause();
        Literal literal_17_1 = new Literal("I(B)", true, false);
        clause_17.clauseList.add(literal_17_1);
        Literal literal_17_2 = new Literal("I(C)", true, false);
        clause_17.clauseList.add(literal_17_2);

        //#18
        Clause clause_18 = new Clause();
        Literal literal_18_1 = new Literal("I(B)", true, false);
        clause_18.clauseList.add(literal_18_1);
        Literal literal_18_2 = new Literal("I(D)", true, false);
        clause_18.clauseList.add(literal_18_2);

        //#19
        Clause clause_19 = new Clause();
        Literal literal_19_1 = new Literal("I(C)", true, false);
        clause_19.clauseList.add(literal_19_1);
        Literal literal_19_2 = new Literal("I(D)", true, false);
        clause_19.clauseList.add(literal_19_2);

        //#20
        Clause clause_20 = new Clause();
        Literal literal_20_1 = new Literal("I(x)", true, true);
        clause_20.clauseList.add(literal_20_1);
        Literal literal_20_2 = new Literal("Ans(x)", true, true);
        clause_20.clauseList.add(literal_20_2);

        master.database.add(clause_1);
        master.database.add(clause_2);
        master.database.add(clause_3);
        master.database.add(clause_4);
        master.database.add(clause_5);
        master.database.add(clause_6);
        master.database.add(clause_7);
        master.database.add(clause_8);
        master.database.add(clause_9);
        master.database.add(clause_10);
        master.database.add(clause_11);
        master.database.add(clause_12);
        master.database.add(clause_13);
        master.database.add(clause_14);
        master.database.add(clause_15);
        master.database.add(clause_16);
        master.database.add(clause_17);
        master.database.add(clause_18);
        master.database.add(clause_19);
        master.database.add(clause_20);
        
        master.output();
        
        System.out.println("-----------------------------------------");
        
        System.out.println("INPUT STRATEGY\n");

        master.inputStrategy(master);
        master.output();
    }

    public static void resolutionTest(Delta db) {
        Clause clauseOne = new Clause();
        Literal literalOne = new Literal("P", true, false);
        clauseOne.clauseList.add(literalOne);

        Clause clauseTwo = new Clause();
        Literal literalTwo = new Literal("~P", false, true);
        Literal literalThree = new Literal("R", true, false);
        clauseTwo.clauseList.add(literalTwo);
        clauseTwo.clauseList.add(literalThree);

        db.database.add(clauseOne);
        db.database.add(clauseTwo);

        System.out.println(db.database.toString());

        Clause test = new Clause();

        Clause test1 = db.database.get(0);
        Clause test2 = db.database.get(1);

        test = test1.resolve(test1, test2);

        db.database.add(test);
    }

    public static void inputTest(Delta db) {
        Clause clauseOne = new Clause();
        Literal literalOne = new Literal("P", true, false);
        Literal literalTwo = new Literal("Z", true, false);
        clauseOne.clauseList.add(literalOne);
        clauseOne.clauseList.add(literalTwo);

        Clause clauseTwo = new Clause();
        Literal literalTwoOne = new Literal("Q", true, false);
        Literal literalTwoTwo = new Literal("~P", false, true);
        clauseTwo.clauseList.add(literalTwoOne);
        clauseTwo.clauseList.add(literalTwoTwo);

        Clause clauseThree = new Clause();
        Literal literalThreeOne = new Literal("R", true, false);
        Literal literalThreeTwo = new Literal("~Q", false, true);
        clauseThree.clauseList.add(literalThreeOne);
        clauseThree.clauseList.add(literalThreeTwo);

        db.database.add(clauseOne);
        db.database.add(clauseTwo);
        db.database.add(clauseThree);

        db.output();
        System.out.println("-------------------------------");

        ArrayList<Clause> test = new ArrayList<Clause>();

        //db.inputStrategy(db);
        db.database.addAll(db.inputStrategy(db));
        //System.out.println(db.database.toString());

        db.output();
        System.out.println("-------------------------------");
    }
}
