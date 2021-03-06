/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suffixtrie;

import java.util.List;

/**
 *
 * @author Amax
 */
public class Suffix_tree {

    SuffixTrieNode root = new SuffixTrieNode();

    // Constructor (Builds a trie of suffixes of the
    // given text)
    Suffix_tree(String txt) {

        // Consider all suffixes of given string and
        // insert them into the Suffix Trie using
        // recursive function insertSuffix() in
        // SuffixTrieNode class
        for (int i = 0; i < txt.length(); i++) {
            root.insertSuffix(txt.substring(i), i);
        }
    }

    /* Prints all occurrences of pat in the Suffix Trie S
    (built for text) */
    String search_tree(String pat) {

        // Let us call recursive search function for
        // root of Trie.
        // We get a list of all indexes (where pat is
        // present in text) in variable 'result'
        List<Integer> result = root.search(pat);

        String message = "";

        // Check if the list of indexes is empty or not
        if (result == null) {
            message = "Pattern not found";
            System.out.println("Pattern not found");
        } else {

            int patLen = pat.length();

            for (Integer i : result) {
                message = message + "Pattern found at position " + (i - patLen) + "\n";
                System.out.println("Pattern found at position " + (i - patLen));
            }
        }
        return message;
    }
}
