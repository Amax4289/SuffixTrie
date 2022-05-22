/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suffixtrie;

/**
 *
 * @author Amax
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Let us build a suffix trie for text
        // "geeksforgeeks.org"
        String txt = "geeksforgeeks.org";
        Suffix_tree S = new Suffix_tree(txt);

        System.out.println("Search for 'ee'");
        S.search_tree("ee");

        System.out.println("\nSearch for 'geek'");
        S.search_tree("geek");

        System.out.println("\nSearch for 'quiz'");
        S.search_tree("quiz");

        System.out.println("\nSearch for 'forgeeks'");
        S.search_tree("forgeeks");

    }

}
