/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.of.ai.project.pkg2;

import java.util.ArrayList;

/**
 * ALL STRATEGIES STORED HERE
 *
 * @author Brandon
 */
public class Delta {

    ArrayList<Clause> database = new ArrayList<Clause>();

    public void output() {
        for (int i = 0; i < database.size(); i++) {
            System.out.print("Clause Number " + i + ": " + database.get(i).toString());
        }
    }

    //at least one of the parents is a single literal
    public void unitStrategy() {
        
    }

    //at least one of the parents is part of the original database
    public ArrayList<Clause> inputStrategy(Delta OG) {

        ArrayList<Clause> newDatabase = new ArrayList<Clause>();

        //iterate across each clause in the original database
        for (int i = 0; i < OG.database.size(); i++) {

            //get the clause that will be used to resolve
            Clause test = OG.database.get(i);

            //attempt to resolve against everything in database
            for (Clause c : OG.database) {

                if ((test.resolve(test, c).clauseList.isEmpty())) {
                    //System.out.println("DONT ADD AN EMPTY SET");
                } else {
                    //System.out.println("ADD A NEW SET");

                    newDatabase.add(test.resolve(test, c));
                }

            }
        }

        //iterate across the newly generated data
        for (int i = 0; i < newDatabase.size(); i++) {

            Clause test = newDatabase.get(i);

            //resolve this new data with all of the old data.
            for (Clause c : OG.database) {
                //System.out.println(c.toString());

                //was accidentally clobering my result, this seems to fix it.
                //check and see if we get an empty, toss it
                //if not empty, add the result. don't overwrite test, derp.
                if ((test.resolve(test, c).clauseList.isEmpty())) {
                    //System.out.println("DONT ADD AN EMPTY SET");
                } else {
                    //test = test.resolve(test, c); //might have just clobbered
                    //System.out.println("ADD A NEW SET");
                    newDatabase.add(test.resolve(test, c));
                }
                
            }
            
        }
        
        return newDatabase;
    }

    //at least one parent is selected from GAMMA or is a child of GAMMA
    public void set_of_supportStrategy() {
        
        
        
    }

    public void orderedStrategy() {
        //only allowed to resolve with the first literal of clauses
    }

    public void directedStrategy() {
        //create a binding that generates data, use ordered resolution on a directed clause,
        //i.e. a horn clause where the positive literal is at the beginning or end.

        //forward, positive literal at end
        //backward, positive literal at the front
    }

    public void deletionStrategy(ArrayList database) {
        //remove pure-literal clauses, can't generate meaningful data
        //a pure literal is one with no matching

        //remove tautologies
        //defined as having both positive and negative mathcing literal in same set
        for (int i = 0; i < database.size(); i++) {
            //System.out.println(database.get(i));
            ArrayList<String> strlist = (ArrayList<String>) database.get(i);
            for (int j = 0; j < strlist.size(); j++) {
                //System.out.println("CHECK CONTENTS");

                //determine if the negative literal is contained in the same set, tautology
                String negativeLiteral = "~" + (String) strlist.get(j);
                if (strlist.contains(negativeLiteral)) {
                    System.out.println("I FOUND A TAUT, KILLING IT");
                    database.remove(i);
                }

            }
            //System.out.println(strlist);
        }

        for (int i = 0; i < database.size(); i++) {

            ArrayList<String> strlist = (ArrayList<String>) database.get(i);

            for (int j = 0; j < strlist.size(); j++) {

                String negativeLiteral = "~" + (String) strlist.get(j);
                //if()

            }

        }

        //subsumption elemination
        //if a subset relationship exists remove the smaller set
        System.out.println("Database After: " + database);
    }

}
