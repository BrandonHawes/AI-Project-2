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
public class Clause {

    ArrayList<Literal> clauseList = new ArrayList<Literal>();

    boolean forward = false;
    boolean backward = false;
    boolean neither = false;

    public Clause() {
    }

    @Override
    public String toString() {
        return "{" + clauseList + '}' + "\n";
    }

    public Clause resolve(Clause first, Clause second) {

        //generate new clause
        Clause newClause = new Clause();

        //iterate across all literals in the first clause
        for (int i = 0; i < first.clauseList.size(); i++) {

            //a literal is either positive or gamma
            if (first.clauseList.get(i).positive) {

                //create the gamma pairing to search for
                String matchPair = "~" + first.clauseList.get(i).getName();

                //iterate across all the literals in the target clause
                for (int j = 0; j < second.clauseList.size(); j++) {

                    //a match is found, we must remove both clauses and generate a new one
                    if (second.clauseList.get(j).getName().equals(matchPair)) {
                        
                        ArrayList<Literal> temp1 = new ArrayList<Literal>(first.clauseList);
                        ArrayList<Literal> temp2 = new ArrayList<Literal>(second.clauseList);
                        
                        temp1.remove(i);
                        temp2.remove(j);
                        
                        newClause.clauseList.addAll(temp1);
                        newClause.clauseList.addAll(temp2);

                    }

                }

                //negative literal case
            } else {

                //create the positive pairing to search for
                String matchPair = first.clauseList.get(i).getName();
                matchPair = matchPair.substring(1);

                for (int j = 0; j < second.clauseList.size(); j++) {

                    //a match is found, we must remove both clauses and generate a new one
                    if (second.clauseList.get(j).getName().equals(matchPair)) {

                        //prevent shallow copying ya goof
                        ArrayList<Literal> temp1 = new ArrayList<Literal>(first.clauseList); //first Clause passed-in's list
                        ArrayList<Literal> temp2 = new ArrayList<Literal>(second.clauseList); //second Clause passed-in's list
                        
                        temp1.remove(i);
                        temp2.remove(j);
                        
                        newClause.clauseList.addAll(temp1);
                        newClause.clauseList.addAll(temp2);
                    }
                }
            }

        }

        //return an arrayList of literals, we can add this to our database now.
        return newClause;

    }

}
